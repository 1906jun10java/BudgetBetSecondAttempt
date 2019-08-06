package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EXPENSE")
public class Expenses {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO, generator="expenseSequence")
	@SequenceGenerator(allocationSize=1, name="expenseSequence", sequenceName="SQ_EXPENSE_PK")
	@Column(name="EXPENSE")
	private int expenseId;
	
	@Column(name="EXPENSE_AMOUNT")
	private double expenseAmount;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="MONTH")
	private String month;

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expense(int expenseId, double expenseAmount, int userId, String type, String month) {
		super();
		this.expenseId = expenseId;
		this.expenseAmount = expenseAmount;
		this.userId = userId;
		this.type = type;
		this.month = month;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(expenseAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + expenseId;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expense other = (Expense) obj;
		if (Double.doubleToLongBits(expenseAmount) != Double.doubleToLongBits(other.expenseAmount))
			return false;
		if (expenseId != other.expenseId)
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", expenseAmount=" + expenseAmount + ", userId=" + userId + ", type="
				+ type + ", month=" + month + "]";
	}
	
}
