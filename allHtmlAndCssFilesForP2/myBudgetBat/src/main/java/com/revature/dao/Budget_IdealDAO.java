package com.revature.dao;

import java.util.List;

import com.revature.beans.Budget_Ideal;

public interface Budget_IdealDAO {
	
	public List<Budget_Ideal> getAllBudget_Ideal();
	public Budget_Ideal getBudget_IdealById(int id);
	public void createBudget_Ideal(Budget_Ideal bi);
	public void updateBudget_Ideal(Budget_Ideal bi);
	public void removeBudget_Ideal(Budget_Ideal bi);

}
