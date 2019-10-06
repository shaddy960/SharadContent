package com.cg.ibs.investment.dao;
import java.util.HashMap;
import com.cg.ibs.common.bean.TransactionBean;
import com.cg.ibs.investment.bean.*;
import com.cg.ibs.investment.exception.InvalidDetailsException;;

public interface ClientDao {
	double viewGoldPrice();
	double viewSilverPrice();
	InvestmentBean viewInvestments(String userId) throws InvalidDetailsException;
	HashMap<Integer, BankMutualFund> viewMF();
	void updateTransaction(String userId, TransactionBean trxn);
	
}