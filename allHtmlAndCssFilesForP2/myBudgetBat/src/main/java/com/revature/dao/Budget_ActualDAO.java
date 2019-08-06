package com.revature.dao;

import java.util.List;

import com.revature.beans.Budget_Actual;

public interface Budget_ActualDAO {
	
	public List<Budget_Actual> getAllBudget_Actual();
	public Budget_Actual getBudget_ActualById(int id);
	public void createBudget_Actual(Budget_Actual ba);
	public void updateBudget_Actual(Budget_Actual ba);
	public void removeBudget_Actual(Budget_Actual ba);

}
