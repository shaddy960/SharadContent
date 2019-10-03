package com.cg.ibs.investment.bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import com.cg.ibs.common.bean.TransactionBean;

public class InvestmentBean extends MutualFund {
	
	private String UCI;
	private String userId;
	private String password;
	private BigDecimal goldunits;
	private double silverunits;
	private double balance;
	private Set<MutualFund> funds;
	private List<TransactionBean> transactionList;
	
	public InvestmentBean() {
		super();
	}
	public InvestmentBean(String uCI, String userId, String password, BigDecimal goldunits, double silverunits,
			double balance, Set<MutualFund> funds, List<TransactionBean> transactionList) {
		super();
		UCI = uCI;
		this.userId = userId;
		this.password = password;
		this.goldunits = goldunits;
		this.silverunits = silverunits;
		this.balance = balance;
		this.funds = funds;
		this.transactionList = transactionList;
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
	public BigDecimal getGoldunits() {
		return goldunits;
	}
	public void setGoldunits(BigDecimal goldunits) {
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
	public List<TransactionBean> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<TransactionBean> transactionList) {
		this.transactionList = transactionList;
	}
	@Override
	public String toString() {
		return "InvestmentBean [UCI=" + UCI + ", userId=" + userId + ", goldunits=" + goldunits + ", silverunits="
				+ silverunits + ", balance=" + balance + ", funds=" + funds + ", transactionList=" + transactionList
				+ "]";
	}
	
	
	
	
}
