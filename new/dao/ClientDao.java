package com.cg.ibs.investment.dao;
import java.util.Map;
import java.util.Set;

import com.cg.ibs.common.bean.TransactionBean;
import com.cg.ibs.investment.bean.*;
import com.cg.ibs.investment.exception.IBSException;

public interface ClientDao {
	double viewGoldPrice() throws IBSException;
	double viewSilverPrice() throws IBSException;
	InvestmentBean viewInvestments(String uCI);
	Map<String, MutualFund> viewMF();
	void updateTransaction(String uCI, TransactionBean trxn);
}
