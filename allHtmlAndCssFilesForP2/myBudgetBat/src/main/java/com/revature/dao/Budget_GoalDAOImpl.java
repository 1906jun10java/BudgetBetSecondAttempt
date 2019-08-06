package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Budget_Goal;

@Repository(value="budget_goalDAO")
@Transactional
public class Budget_GoalDAOImpl implements Budget_GoalDAO {
	private SessionFactory sf;
	
	@Autowired
	public Budget_GoalDAOImpl(SessionFactory sf) {
		this.sf= sf;
	}

	@Override
	public List<Budget_Goal> getAllBudget_Goal() {
		Session s = sf.getCurrentSession();
		return s.createQuery("from Budget_Goal").getResultList();
		
	}

	@Override
	public Budget_Goal getBudget_GoalById(int id) {
		return sf.getCurrentSession().get(Budget_Goal.class, id);
		
	}

	@Override
	public void createBudget_Goal(Budget_Goal bg) {
		sf.getCurrentSession().persist(bg);
		
	}

	@Override
	public void updateBudget_Goal(Budget_Goal bg) {
		sf.getCurrentSession().update(bg);
		
	}

	@Override
	public void removeBudget_Goal(Budget_Goal bg) {
		sf.getCurrentSession().delete(bg);
		
	}

}
