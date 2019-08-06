package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Budget_Ideal;

@Repository(value="budget_idealDAO")
@Transactional
public class Budget_IdealDAOImpl implements Budget_IdealDAO {
	private SessionFactory sf;
	
	@Autowired
	public Budget_IdealDAOImpl(SessionFactory sf) {
		this.sf= sf;
	}

	@Override
	public List<Budget_Ideal> getAllBudget_Ideal() {
		Session s = sf.getCurrentSession();
		return s.createQuery("from Budget_Ideal").getResultList();
		
	}

	@Override
	public Budget_Ideal getBudget_IdealById(int id) {
		return sf.getCurrentSession().get(Budget_Ideal.class, id);
		
	}

	@Override
	public void createBudget_Ideal(Budget_Ideal bi) {
		sf.getCurrentSession().persist(bi);
		
	}

	@Override
	public void updateBudget_Ideal(Budget_Ideal bi) {
		sf.getCurrentSession().update(bi);
		
	}

	@Override
	public void removeBudget_Ideal(Budget_Ideal bi) {
		sf.getCurrentSession().delete(bi);
		
	}

}
