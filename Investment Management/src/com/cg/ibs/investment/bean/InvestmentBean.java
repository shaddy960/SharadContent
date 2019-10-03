package com.cg.ibs.investment.bean;

public class InvestmentBean extends MutualFund {
	private int idm;
	private double goldunits;
	private double silverunits;
	private double balance;
	private MutualFund[]funds;
	public InvestmentBean(int idm, double goldunits, double silverunits, double balance, MutualFund[] m) {
		super();
		this.idm=idm;
		this.goldunits = goldunits;
		this.silverunits = silverunits;
		this.balance = balance;
		this.funds = m;
	}
	public int getIdm() {
		return idm;
	}
	public void setId(int idm) {
		this.idm = idm;
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
	public MutualFund[] getFunds() {
		return funds;
	}
	public void setFunds(MutualFund[] funds) {
		this.funds = funds;
	}
	
	
}
