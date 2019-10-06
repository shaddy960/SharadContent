package com.cg.ibs.investment.bean;


import java.util.Set;
import java.util.TreeSet;

import com.cg.ibs.common.bean.TransactionBean;

public class InvestmentBean extends MutualFund {
	
	private String UCI;
	private String userId;
	private String password;
	private double goldunits;
	private double silverunits;
	private double balance;
	private Set<MutualFund> funds;
	private TreeSet<TransactionBean> transactionSet;
	
	

	public InvestmentBean(String uCI, String userId, String password, double goldunits, double silverunits,
			double balance, Set<MutualFund> funds, TreeSet<TransactionBean> transactionSet) {
		super();
		UCI = uCI;
		this.userId = userId;
		this.password = password;
		this.goldunits = goldunits;
		this.silverunits = silverunits;
		this.balance = balance;
		this.funds = funds;
		this.transactionSet = transactionSet;
	}

	
	public InvestmentBean(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}


	public String getUCI() {
		return UCI;
	}
	public void setUCI(String uCI) {
		UCI = uCI;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getGoldunits() {
		return goldunits;
	}
	public void setGoldunits(double goldunits) {
		this.goldunits = goldunits;
	}
	public double getSilverunits() {
		return silverunits;
	}
	public void setSilverunits(double silverunits) {
		this.silverunits = silverunits;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Set<MutualFund> getFunds() {
		return funds;
	}
	public void setFunds(Set<MutualFund> funds) {
		this.funds = funds;
	}
	public TreeSet<TransactionBean> getTransactionSet() {
		return transactionSet;
	}
	public void setTransactionList(TreeSet<TransactionBean> transactionSet) {
		this.transactionSet = transactionSet;
	}
	@Override
	public String toString() {
		return "InvestmentBean [UCI=" + UCI + ", goldunits=" + goldunits + ", silverunits=" + silverunits + ", balance="
				+ balance + ", funds=" + funds + "]";
	}
	
	
}

	
