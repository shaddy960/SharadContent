package com.cg.ibs.im.dao;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import com.cg.ibs.common.bean.*;

import com.cg.ibs.im.bean.*;

public class InvestmentDaoImpl implements BankDao, ClientDao {
	private double goldPrice;
	private double silverPrice;
	private Set<MutualFund> mf=new HashSet<>();
	private Set<InvestmentBean> invArr=new HashSet<>();
	public List<TransactionBean> invTrxn;
	
	
	
	@Override
	public double viewGoldPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double viewSilverPrice() {
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
	public void updateGoldPrice(double x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateSilverPrice(double y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateMF(MutualFund z) {
		// TODO Auto-generated method stub
		
	}
	 	
	
}
