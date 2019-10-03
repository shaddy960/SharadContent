package com.cg.ibs.investment.dao;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

import com.cg.ibs.common.bean.TransactionBean;
import com.cg.ibs.common.bean.TransactionType;
import com.cg.ibs.investment.bean.InvestmentBean;
import com.cg.ibs.investment.bean.MutualFund;
import com.cg.ibs.investment.exception.IBSException;

public class InvestmentDaoImpl implements BankDao, ClientDao {
	private static final TransactionType CREDIT = null;
	private static final TransactionType DEBIT = null;
	private double goldPrice;
	private double silverPrice;
	private LocalDate date;
	private Map<String,MutualFund> mutualFunds=new HashMap<>();
	private Map<String, InvestmentBean> investmentBeans=new HashMap<>();
	public List<TransactionBean> transactionBeans;
	
	public InvestmentDaoImpl() {
		MutualFund hdfc=new MutualFund("HDFC",250,2000);
		MutualFund sbi=new MutualFund("SBI",300,1500);
		MutualFund icici=new MutualFund("ICICI",450,1000);
		mutualFunds.put("HDFC", hdfc);
		mutualFunds.put("SBI", sbi);
		mutualFunds.put("ICICI", icici);
		LocalDate date;
		
		TransactionBean trxn1=new TransactionBean(100100100, CREDIT, LocalDate.now() , 2000);
		TransactionBean trxn2=new TransactionBean(100100101, DEBIT, LocalDate.now() , 3000);
		transactionBeans.add(trxn1);
		transactionBeans.add(trxn2);
		
		InvestmentBean cust1=new InvestmentBean("4100101", "Sachin", "mumbai", 200.0, 2000.0, 50000.0, mutualFunds, transactionBeans);
		InvestmentBean cust2=new InvestmentBean("4100102", "Gautam", "delhi", 300.0, 3000.0, 40000.0, mutualFunds, transactionBeans);	
		investmentBeans.put("4100101", cust1);
		investmentBeans.put("4100102", cust2);
		
		goldPrice=35000;
		silverPrice=29000;
		
		
	
		
		
		
	}

	@Override
	public double viewGoldPrice() throws IBSException {
		
		return goldPrice;
	}

	@Override
	public double viewSilverPrice() throws IBSException {
		
		return silverPrice;
	}

	@Override
	public InvestmentBean viewInvestments(String uCI) {
		
		return investmentBeans.get(uCI);
	}

	@Override
	public Map<String, MutualFund> viewMF() {
		
		return mutualFunds ;
	}

	@Override
	public void updateTransaction(String uCI, TransactionBean trxn) {
		
		investmentBeans.get(uCI).getTransactionList().add(trxn);
		
	}

	@Override
	public void updateGoldPrice(double x) throws IBSException {
		this.goldPrice=x;
		
	}

	@Override
	public void updateSilverPrice(double y) throws IBSException {
		this.silverPrice=y;
		
	}

	@Override
	public void updateMF(Map<String, MutualFund> z) {
		this.mutualFunds=z;
		
	}

	
	
	
}
