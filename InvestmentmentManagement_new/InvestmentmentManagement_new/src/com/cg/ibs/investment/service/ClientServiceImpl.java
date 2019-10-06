package com.cg.ibs.investment.service;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.InputMismatchException;


import com.cg.ibs.common.bean.TransactionBean;
import com.cg.ibs.common.bean.TransactionType;
import com.cg.ibs.investment.bean.BankMutualFund;
import com.cg.ibs.investment.bean.InvestmentBean;
import com.cg.ibs.investment.bean.MutualFund;
import com.cg.ibs.investment.dao.ClientDao;
import com.cg.ibs.investment.dao.InvestmentDaoImpl;
import com.cg.ibs.investment.exception.InsuffBalanceException;
import com.cg.ibs.investment.exception.InvalidAmountException;
import com.cg.ibs.investment.exception.InvalidDetailsException;
import com.cg.ibs.investment.exception.InvalidUnitsException;


public class ClientServiceImpl implements ClientService {
	static int count=0;				//field variables initialization 
	ClientDao clientdao = new InvestmentDaoImpl();
	TransactionBean trxn = new TransactionBean();
	

	@Override
	public HashMap<Integer, BankMutualFund> viewMFPlans() {		//viewing mutual funds available 		
		return (clientdao.viewMF());	
	}

	@Override
	public double viewGoldPrice() {								//viewing gold price
		return (clientdao.viewGoldPrice());

	}

	@Override
	public double viewSilverPrice() {							//viewing silver price
		return (clientdao.viewSilverPrice());

	}

	@Override
	public void buyGold(double gunits, String userId) throws InvalidUnitsException, InsuffBalanceException, InvalidDetailsException,InputMismatchException {	//method to buy gold
		
		if (gunits > 0 ) {
			InvestmentBean investmentBean = clientdao.viewInvestments(userId);
			
			if (investmentBean.getBalance() >= gunits * clientdao.viewGoldPrice()) {

				investmentBean.setGoldunits(investmentBean.getGoldunits() + gunits);
				investmentBean.setBalance(investmentBean.getBalance() - gunits * clientdao.viewGoldPrice());
				trxn.setTransactionAmount(new BigDecimal(gunits * clientdao.viewGoldPrice()));				//updating transaction history
				trxn.setTransactionDate(LocalDate.now());
				trxn.setTransactionType(TransactionType.DEBIT);
				trxn.setTransactionId(new BigInteger("100100100", count));
				investmentBean.getTransactionSet().add(trxn);
				

			} else {
				
				throw new InsuffBalanceException("Insufficient balance in your account");
			}

		} else {
			throw new InvalidUnitsException("Please Enter valid weight of Gold");
		}
		}

	@Override
	public void sellGold(double gunits, String userId) throws InvalidUnitsException, InvalidDetailsException, InsuffBalanceException {		//method to sell gold
		InvestmentBean investmentBean = clientdao.viewInvestments(userId);
		if (gunits > 0) {
			if ( gunits < investmentBean.getGoldunits()) {
				investmentBean.setGoldunits(investmentBean.getGoldunits() - gunits);
				investmentBean.setBalance(investmentBean.getBalance() + gunits * clientdao.viewGoldPrice());
				trxn.setTransactionAmount(new BigDecimal(gunits * clientdao.viewGoldPrice()));				//updating transaction history
				trxn.setTransactionDate(LocalDate.now());
				trxn.setTransactionType(TransactionType.CREDIT);
				trxn.setTransactionId(new BigInteger("100100100", count));
				investmentBean.getTransactionSet().add(trxn);
			}else {
				throw new InsuffBalanceException("Insufficient gold units in your account");
			}

			

		} else {
			throw new InvalidUnitsException("Please Enter valid weight of Gold");
		}

	}

	@Override
	public void buySilver(double sunits, String userId)  throws InsuffBalanceException, InvalidUnitsException, InvalidDetailsException {		//method to buy silver

		if (sunits > 0) {
			InvestmentBean investmentBean = clientdao.viewInvestments(userId);
			if (investmentBean.getBalance() >= sunits * clientdao.viewSilverPrice()) {

				investmentBean.setSilverunits(investmentBean.getSilverunits() + sunits);
				investmentBean.setBalance(investmentBean.getBalance() - sunits * clientdao.viewSilverPrice());
				trxn.setTransactionAmount(new BigDecimal(sunits * clientdao.viewSilverPrice()));					//updating transaction history
				trxn.setTransactionDate(LocalDate.now());
				trxn.setTransactionType(TransactionType.DEBIT);
				trxn.setTransactionId(new BigInteger("100100100", count));
				investmentBean.getTransactionSet().add(trxn);

			} else {
				throw new InsuffBalanceException("Insufficient balance in your account");
			}

		} else {
			throw new InvalidUnitsException("Please Enter valid weight of Silver");
		}

	}

	@Override
	public void sellSilver(double sunits, String userId)  throws InvalidUnitsException, InvalidDetailsException, InsuffBalanceException {			//method to sell silver
		InvestmentBean investmentBean = clientdao.viewInvestments(userId);
		if (sunits > 0) {
			if (sunits < investmentBean.getSilverunits()) {
				investmentBean.setSilverunits(investmentBean.getSilverunits() - sunits);
				investmentBean.setBalance(investmentBean.getBalance() + sunits * clientdao.viewSilverPrice());
				trxn.setTransactionAmount(new BigDecimal(sunits * clientdao.viewSilverPrice()));				//updating transaction history
				trxn.setTransactionDate(LocalDate.now());
				trxn.setTransactionType(TransactionType.CREDIT);
				trxn.setTransactionId(new BigInteger("100100100", count));
				investmentBean.getTransactionSet().add(trxn);
				
			}else {
				throw new InsuffBalanceException("Insufficient silver units in your account");
			}

		} else {
			throw new InvalidUnitsException("Please Enter valid weight of Silver");
		}
	}

	@Override
	public void investMF(double mfAmount, String userId, Integer mfId)  throws InsuffBalanceException, InvalidAmountException, InvalidDetailsException {		//method to invest in mutual funds
		if (mfAmount > 0) {
			if (clientdao.viewMF().containsKey(mfId)) {
				InvestmentBean investmentBean = null;
			
					investmentBean = clientdao.viewInvestments(userId);
				
				double nav = clientdao.viewMF().get(mfId).getNav();
                 
				if (investmentBean.getBalance() >= mfAmount) {
					MutualFund mutualFund=new MutualFund();
					mutualFund.setmfid(mfId);
					mutualFund.setTitle(clientdao.viewMF().get(mfId).getTitle());
					mutualFund.setNav(clientdao.viewMF().get(mfId).getNav());
					LocalDate dt=LocalDate.now();			
			      double mfunits=(mfAmount / nav);
			      mutualFund.setMfUnits(mfunits);
			      mutualFund.setOpeningDate(dt);
			      mutualFund.setStatus(true);
			      
					investmentBean.getFunds().add(mutualFund);
					investmentBean.setFunds(investmentBean.getFunds());						
						
						investmentBean.setBalance(investmentBean.getBalance() - mfAmount);
						trxn.setTransactionAmount(new BigDecimal(mfAmount));				//updating transaction history
						trxn.setTransactionDate(LocalDate.now());
						trxn.setTransactionType(TransactionType.DEBIT);
						trxn.setTransactionId(new BigInteger("100100100", count));
						investmentBean.getTransactionSet().add(trxn);
					

				} else {
					throw new InsuffBalanceException("Insufficient balance in your account");
				}
			}else{
				throw new InvalidDetailsException("Please enter a valid MF plan");
			}
		} else {
			throw new InvalidAmountException("Please enter a valid Amount");
		}
	}

	@Override
	public void withdrawMF( String userId, MutualFund mutualFund) throws InvalidDetailsException   {					//method to withdraw mutual funds plan
		
		if(clientdao.viewInvestments(userId)!=null){
			InvestmentBean investmentBean = clientdao.viewInvestments(userId);
			investmentBean.setBalance(investmentBean.getBalance() + mutualFund.getMfAmount());
			
				investmentBean.getFunds().remove(mutualFund);
				
			
				trxn.setTransactionAmount(new BigDecimal(mutualFund.getMfAmount()));					//updating transaction history
				trxn.setTransactionDate(LocalDate.now());
				trxn.setTransactionType(TransactionType.CREDIT);
				trxn.setTransactionId(new BigInteger("100100100", count));
				investmentBean.getTransactionSet().add(trxn);
			
		
		}else{
			throw new  InvalidDetailsException("Account not available");
		}
	}

	@Override
	public InvestmentBean viewInvestments(String userId) throws InvalidDetailsException{				//method to view investments of the Customer
		if(clientdao.viewInvestments(userId)!=null){
		return clientdao.viewInvestments(userId);}
		else{
			throw new InvalidDetailsException("Account not available");
		}

	}

	@Override
	public boolean validateCustomer(String userId, String password) throws InvalidDetailsException {		//method to validate the customer
		if(clientdao.viewInvestments(userId)!=null){
		if (userId.equals(clientdao.viewInvestments(userId).getUserId())) {

			String correctPassword = clientdao.viewInvestments(userId).getPassword();
			if (password.equals(correctPassword)) {
				return true;
			}else {
				throw new InvalidDetailsException("Invalid Password");
			}
		}
		}
		else{
			throw new InvalidDetailsException("Invalid Username or password");
		}
		return false;

	}

}
