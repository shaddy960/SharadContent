package com.cg.ibs.investment.service;

import com.cg.ibs.investment.bean.BankMutualFund;
import com.cg.ibs.investment.bean.MutualFund;
import com.cg.ibs.investment.exception.InvalidDetailsException;
import com.cg.ibs.investment.exception.InvalidGoldPriceException;
import com.cg.ibs.investment.exception.InvalidMFException;
import com.cg.ibs.investment.exception.InvalidSilverPriceException;

public interface BankService {
	public void updateGoldPrice(double goldPrice) throws InvalidGoldPriceException;
	public void updateSilverPrice(double silverPrice) throws InvalidSilverPriceException;
	public void updateMF(BankMutualFund mutualFund) throws InvalidMFException;
}