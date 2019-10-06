package com.cg.ibs.investment.dao;

import com.cg.ibs.investment.bean.*;
import com.cg.ibs.investment.exception.InvalidGoldPriceException;
import com.cg.ibs.investment.exception.InvalidSilverPriceException;

public interface BankDao {	
	 void updateGoldPrice(double x) throws InvalidGoldPriceException;
	 void updateSilverPrice(double y) throws InvalidSilverPriceException;
	 void updateMF(BankMutualFund mutualFund);
	
	
}
