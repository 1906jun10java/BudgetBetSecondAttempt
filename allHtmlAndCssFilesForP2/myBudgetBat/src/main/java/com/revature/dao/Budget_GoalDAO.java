package com.revature.dao;

import java.util.List;

import com.revature.beans.Budget_Goal;

public interface Budget_GoalDAO {
	
	public List<Budget_Goal> getAllBudget_Goal();
	public Budget_Goal getBudget_GoalById(int id);
	public void createBudget_Goal(Budget_Goal bg);
	public void updateBudget_Goal(Budget_Goal bg);
	public void removeBudget_Goal(Budget_Goal bg);

}
