
	package com.cg.ibs.investment.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.cg.ibs.common.bean.TransactionBean;
import com.cg.ibs.common.bean.TransactionType;
import com.cg.ibs.investment.bean.BankMutualFund;
import com.cg.ibs.investment.bean.InvestmentBean;
import com.cg.ibs.investment.bean.MutualFund;
import com.cg.ibs.investment.exception.InvalidDetailsException;
import com.cg.ibs.investment.exception.InvalidGoldPriceException;
import com.cg.ibs.investment.exception.InvalidSilverPriceException;

	public class InvestmentDaoImpl implements BankDao, ClientDao  {
																		//declaring field variables
		private static double goldPrice;
		private static double silverPrice;
		private static HashMap<Integer, BankMutualFund> mutualFunds=new HashMap<>();
		private static Set<MutualFund> mutualFundscust1=new HashSet<>();
		private static Set<MutualFund> mutualFundscust2=new HashSet<>();
		private static Set<MutualFund> mutualFundscust3=new HashSet<>();
		private static Set<MutualFund> mutualFundscust4=new HashSet<>();
		private static Set<MutualFund> mutualFundscust5=new HashSet<>();
		private static HashMap<String, InvestmentBean> investmentBeans=new HashMap<>();
		public static List<TransactionBean> transactionBeans=new ArrayList<TransactionBean>();
		private static TreeSet<TransactionBean> transactionBeancust1=new TreeSet<>();
		private static TreeSet<TransactionBean> transactionBeancust2=new TreeSet<>();
		private static TreeSet<TransactionBean> transactionBeancust3=new TreeSet<>();
		private static TreeSet<TransactionBean> transactionBeancust4=new TreeSet<>();
		private static TreeSet<TransactionBean> transactionBeancust5=new TreeSet<>();;
	
		
		static {
			BankMutualFund plan1=new BankMutualFund(10001,"IBS Basic Plan",200);		//assigning some values to variables
			BankMutualFund plan2=new BankMutualFund(10002,"IBS Premium Plan",400);
			BankMutualFund plan3=new BankMutualFund(10003,"IBS Smart Plan",600);
			mutualFunds.put(10001, plan1);
			mutualFunds.put(10002, plan2);
			mutualFunds.put(10003, plan3);
			
			LocalDate dt1=LocalDate.parse("2018-12-07");
			mutualFundscust1.add(new MutualFund(10001,"IBS Basic Plan",200,50,dt1,null,true));
			mutualFundscust2.add(new MutualFund(10002,"IBS Premium Plan",400,50,dt1,null,true));
			mutualFundscust3.add(new MutualFund(10003,"IBS Smart Plan",600,50,dt1,null,true));
			mutualFundscust4.add(new MutualFund(10003,"IBS Smart Plan",600,50,dt1,null,true));
			mutualFundscust5.add(new MutualFund(10003,"IBS Smart Plan",600,50,dt1,null,true));
			
			
			TransactionBean trxn1=new TransactionBean(new BigInteger("100100100"), TransactionType.CREDIT, LocalDate.now() , new BigDecimal("2000"));
			TransactionBean trxn2=new TransactionBean(new BigInteger("100100100"),TransactionType.DEBIT , LocalDate.now() ,new BigDecimal("2000") );
			transactionBeans.add(trxn1);
			transactionBeans.add(trxn2);
			
		
			InvestmentBean cust1=new InvestmentBean("4000500060000001", "Sachin", "mumbai", 220.0, 2000.0, 100000.0, mutualFundscust1, transactionBeancust1);
			InvestmentBean cust2=new InvestmentBean("4000500060000002", "Gautam", "delhi", 300.0, 3000.0, 50000.0, mutualFundscust2, transactionBeancust2);	
			InvestmentBean cust3=new InvestmentBean("4000500060000003", "Sehwag", "noida", 200.0, 2000.0, 100000.0, mutualFundscust1, transactionBeancust3);
			InvestmentBean cust4=new InvestmentBean("4000500060000004", "Dhoni", "ranchi", 100.0, 5000.0, 100000.0, mutualFundscust1, transactionBeancust4);
			InvestmentBean cust5=new InvestmentBean("4000500060000005", "Kohli", "gurgaon", 250.0, 4000.0, 100000.0, mutualFundscust1, transactionBeancust5);
			InvestmentBean bank = new InvestmentBean("Bank", "password");
			investmentBeans.put("Sachin", cust1);
			investmentBeans.put("Gautam", cust2);
			investmentBeans.put("Sehwag", cust3);
			investmentBeans.put("Dhoni", cust4);
			investmentBeans.put("Kohli", cust5);
			
			investmentBeans.put("Bank", bank);
			
			
			goldPrice=4000;
			silverPrice=400;
					
		}
														//methods to work upon dao variables
		@Override
		public double viewGoldPrice() {
			
			return goldPrice;
		}

		@Override
		public double viewSilverPrice() {
			
			return silverPrice;
		}

		@Override
		public InvestmentBean viewInvestments(String uCI)throws InvalidDetailsException {
			
			return investmentBeans.get(uCI);
		}

		@Override
		public HashMap<Integer, BankMutualFund> viewMF() {
			
			return mutualFunds ;
		}

		@Override
		public void updateTransaction(String uCI, TransactionBean trxn) {
			investmentBeans.get(uCI).getTransactionSet().add(trxn);
			
		}

		@Override
		public void updateGoldPrice(double x) throws InvalidGoldPriceException {
			InvestmentDaoImpl.goldPrice=x;
			
		}

		@Override
		public void updateSilverPrice(double y) throws InvalidSilverPriceException {
			InvestmentDaoImpl.silverPrice=y;
			
		}

		@Override
		public void updateMF(BankMutualFund mutualFund) {
			mutualFunds.put(mutualFund.getmfid(), mutualFund);
			
		}

		

}
