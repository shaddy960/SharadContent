package com.cg.ibs.investment.exception;

public class InsuffBalanceException extends Exception implements IBSException {

	
	private static final long serialVersionUID = 1L;

	public InsuffBalanceException() {
		// TODO Auto-generated constructor stub
	}

	public InsuffBalanceException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InsuffBalanceException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InsuffBalanceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public InsuffBalanceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
