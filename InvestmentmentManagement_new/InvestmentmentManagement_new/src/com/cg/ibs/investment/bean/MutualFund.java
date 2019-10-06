package com.cg.ibs.investment.bean;


import java.time.LocalDate;

public class MutualFund {
	private int mfid;
	private String title;
	private double nav;
	private double mfUnits;
	private double mfAmount;
	private LocalDate openingDate;
	private LocalDate closingDate=null;
	private boolean status=false;
	
	public MutualFund(){
		
	}

	public MutualFund(int mfid, String title, double nav, double mfUnits, LocalDate openingDate,
			LocalDate closingDate, boolean status) {
		super();
		this.mfid = mfid;
		this.title = title;
		this.nav = nav;
		this.mfUnits = mfUnits;
		this.openingDate = openingDate;
		this.closingDate = closingDate;
		this.status = status;
	}

	

	@Override
	public String toString() {
		return "MutualFund [mfid=" + mfid + ", title=" + title + ", nav=" + nav + ", mfUnits=" + mfUnits
				+ ", openingDate=" + openingDate + ", closingDate=" + closingDate + ", status=" + status + "]";
	}

	public int getmfid() {
		return mfid;
	}

	public void setmfid(int mfid) {
		this.mfid = mfid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getNav() {
		return nav;
	}

	public void setNav(double nav) {
		this.nav = nav;
	}

	public double getMfUnits() {
		return mfUnits;
	}

	public void setMfUnits(double mfUnits) {
		this.mfUnits = mfUnits;
	}

	public double getMfAmount() {
		return nav*mfUnits;
	}

	public void setMfAmount(double mfAmount) {
		this.mfAmount = mfAmount;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public LocalDate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	
}