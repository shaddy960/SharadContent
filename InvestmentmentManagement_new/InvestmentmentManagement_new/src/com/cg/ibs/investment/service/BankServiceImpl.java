package com.cg.ibs.investment.service;

import com.cg.ibs.investment.bean.BankMutualFund;
import com.cg.ibs.investment.dao.BankDao;
import com.cg.ibs.investment.dao.InvestmentDaoImpl;
import com.cg.ibs.investment.exception.InvalidGoldPriceException;
import com.cg.ibs.investment.exception.InvalidMFException;
import com.cg.ibs.investment.exception.InvalidSilverPriceException;

public class BankServiceImpl implements BankService {
	BankDao daoObject = new InvestmentDaoImpl();		//declaring field variables

	

	public boolean isValidGoldSilver(double price) {	//validating changes in gold and silver price	
		boolean check = false;
		if (price > 0) {
			check = true;
		}
		return check;
	}

	public boolean isValidMutualFund(BankMutualFund mutualFund) {		//validating updating of Mutual fund plans
		boolean check = false;
		if (mutualFund.getNav() > 0) {
			check = true;
		}
		return check;
	}

	public void updateGoldPrice(double goldPrice) throws InvalidGoldPriceException {		//updating gold price
		if (isValidGoldSilver(goldPrice)) {
			daoObject.updateGoldPrice(goldPrice);
		} else {
			throw new InvalidGoldPriceException("Please, Enter a valid price of Gold");
		}
	}

	public void updateSilverPrice(double silverPrice) throws InvalidSilverPriceException {	//updating silver price
		if (isValidGoldSilver(silverPrice)) {
			daoObject.updateSilverPrice(silverPrice);
		} else {
			throw new InvalidSilverPriceException("Please, Enter a valid price of Silver");
		}
	}

	public void updateMF(BankMutualFund mutualFund) throws InvalidMFException {				//updating mutual fund plans
		if (isValidMutualFund(mutualFund)) {
			daoObject.updateMF(mutualFund);
		} else {
			throw new InvalidMFException("enter a valid mutual funds units");
		}
	}

}