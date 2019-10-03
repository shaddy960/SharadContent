package com.cg.ibs.investment.dao;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cg.ibs.common.bean.TransactionBean;
import com.cg.ibs.investment.bean.*;
import com.cg.ibs.investment.exception.IBSException;

public class InvestmentDaoImpl implements BankDao, ClientDao {
	private double goldPrice;
	private double silverPrice;
	private Set<MutualFund> mf=new HashSet<>();
	private Set<InvestmentBean> invArr=new HashSet<>();
	public List<TransactionBean> invTrxn;
	@Override
	public double viewGoldPrice() throws IBSException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double viewSilverPrice() throws IBSException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public InvestmentBean viewInvestments() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<MutualFund> viewMF() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TransactionBean updateTransaction() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateGoldPrice(double x) throws IBSException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateSilverPrice(double y) throws IBSException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateMF(MutualFund z) {
		// TODO Auto-generated method stub
		
	}
	
}
