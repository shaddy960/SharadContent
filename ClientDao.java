package com.cg.ibs.im.dao;

import java.util.Set;

import com.cg.ibs.common.bean.TransactionBean;
import com.cg.ibs.exception.IBSException;
import com.cg.ibs.im.bean.InvestmentBean;
import com.cg.ibs.im.bean.MutualFund;

public interface ClientDao {
double viewGoldPrice() throws IBSException;
double viewSilverPrice() throws IBSException;
InvestmentBean viewInvestments();
Set<MutualFund> viewMF();
TransactionBean updateTransaction();

}
