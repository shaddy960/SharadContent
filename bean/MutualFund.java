package com.cg.ibs.investment.bean;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MutualFund {
	private String id;
	private double nav;
	private double mfunits;
	private BigDecimal premiumBal;
	private LocalDate openingDate;
	private LocalDate closingDate=null;
	private boolean status=false;
	
	public MutualFund(){
		
	}

	public MutualFund(String id, double nav, double mfunits, BigDecimal premiumBal, LocalDate openingDate,
			LocalDate closingDate, boolean status) {
		super();
		this.id = id;
		this.nav = nav;
		this.mfunits = mfunits;
		this.premiumBal = nav*mfunits;
		this.openingDate = openingDate;
		this.closingDate = closingDate;
		this.status = status;
	}
	
	
}
