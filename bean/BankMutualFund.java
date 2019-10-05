package com.cg.ibs.investment.bean;

public class BankMutualFund {
	private String id;
	private double nav;
	public BankMutualFund(String id, double nav) {
		super();
		this.id = id;
		this.nav = nav;
	}
	public BankMutualFund() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getNav() {
		return nav;
	}
	public void setNav(double nav) {
		this.nav = nav;
	}
	@Override
	public String toString() {
		return "BankMutualFund [id=" + id + ", nav=" + nav + "]";
	}
	
}
