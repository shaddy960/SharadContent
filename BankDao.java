package com.cg.ibs.im.dao;

import com.cg.ibs.exception.IBSException;
import com.cg.ibs.im.bean.MutualFund;

public interface BankDao {
 void updateGoldPrice(double x) throws IBSException;
 void updateSilverPrice(double y) throws IBSException;
 void updateMF(MutualFund z);
}
