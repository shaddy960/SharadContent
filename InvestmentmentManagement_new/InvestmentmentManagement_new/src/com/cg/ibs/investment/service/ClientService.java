package com.cg.ibs.investment.service;


import java.util.HashMap;
import java.util.InputMismatchException;

import com.cg.ibs.investment.bean.BankMutualFund;
import com.cg.ibs.investment.bean.InvestmentBean;
import com.cg.ibs.investment.bean.MutualFund;
import com.cg.ibs.investment.exception.InsuffBalanceException;
import com.cg.ibs.investment.exception.InvalidAmountException;
import com.cg.ibs.investment.exception.InvalidDetailsException;
import com.cg.ibs.investment.exception.InvalidUnitsException;

public interface ClientService {
	public HashMap<Integer, BankMutualFund> viewMFPlans();
	public double viewGoldPrice();
	public double viewSilverPrice();
	public void buyGold(double gunits, String userId) throws InvalidUnitsException, InsuffBalanceException, InvalidDetailsException,InputMismatchException;
	public void sellGold(double gunits,String userId) throws InvalidUnitsException,  InvalidDetailsException, InsuffBalanceException;
	public void buySilver(double sunits,String userId) throws InvalidUnitsException, InsuffBalanceException,  InvalidDetailsException;
	public void sellSilver(double sunits,String userId) throws InvalidUnitsException, InvalidDetailsException, InsuffBalanceException;
	public void investMF(double mfAmount,String userId, Integer mfId) throws InsuffBalanceException, InvalidAmountException,  InvalidDetailsException;
	public void withdrawMF(String userId, MutualFund mutualFund) throws InvalidDetailsException;
	public InvestmentBean viewInvestments(String userId)throws  InvalidDetailsException;
	public boolean validateCustomer(String userId,String password) throws InvalidDetailsException;
}
