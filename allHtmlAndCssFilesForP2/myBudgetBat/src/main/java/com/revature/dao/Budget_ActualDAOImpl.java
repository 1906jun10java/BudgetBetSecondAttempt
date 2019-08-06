package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Budget_Actual;

@Repository(value="budget_actualDAO")
@Transactional
public class Budget_ActualDAOImpl implements Budget_ActualDAO {
	private SessionFactory sf;
	
	@Autowired
	public Budget_ActualDAOImpl(SessionFactory sf) {
		this.sf= sf;
	}

	@Override
	public List<Budget_Actual> getAllBudget_Actual() {
		Session s = sf.getCurrentSession();
		return s.createQuery("from Budget_Actual").getResultList();
		
	}

	@Override
	public Budget_Actual getBudget_ActualById(int id) {
		return sf.getCurrentSession().get(Budget_Actual.class, id);
		
	}

	@Override
	public void createBudget_Actual(Budget_Actual ba) {
		sf.getCurrentSession().persist(ba);
		
	}

	@Override
	public void updateBudget_Actual(Budget_Actual ba) {
		sf.getCurrentSession().update(ba);
		
	}

	@Override
	public void removeBudget_Actual(Budget_Actual ba) {
		sf.getCurrentSession().delete(ba);
		
	}

}
