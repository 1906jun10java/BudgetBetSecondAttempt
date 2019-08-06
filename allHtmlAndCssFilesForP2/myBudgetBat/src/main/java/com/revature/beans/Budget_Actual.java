package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BUDGET_ACTUAL")
public class Budget_Actual {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO, generator="budgetASequence")
	@SequenceGenerator(allocationSize=1, name="budgetASequence", sequenceName="SQ_BUDGET_A_PK")
	@Column(name="BUDGET_A_ID")
	private int budgetAId;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="USER_ID")
	private User userId;
	
	@Column(name="CREDIT_CARD_INTEREST")
	private double ccInterest;
	
	@Column(name="TRANSPORTATION")
	private double transportation;
	
	@Column(name="HOUSING")
	private double housing;
	
	@Column(name="GROCERY")
	private double grocery;
	
	@Column(name="ENTERTAINMENT")
	private double entertainment;
	
	@Column(name="LUXURY")
	private double luxury;
	
	@Column(name="OTHER")
	private double other;
	
	public Budget_Actual() {
		super();
	}

	public Budget_Actual(User userId, double ccInterest, double transportation, double housing, double grocery,
			double entertainment, double luxury, double other) {
		super();
		this.userId = userId;
		this.ccInterest = ccInterest;
		this.transportation = transportation;
		this.housing = housing;
		this.grocery = grocery;
		this.entertainment = entertainment;
		this.luxury = luxury;
		this.other = other;
	}

	public Budget_Actual(int budgetAId, User userId, double ccInterest, double transportation, double housing,
			double grocery, double entertainment, double luxury, double other) {
		super();
		this.budgetAId = budgetAId;
		this.userId = userId;
		this.ccInterest = ccInterest;
		this.transportation = transportation;
		this.housing = housing;
		this.grocery = grocery;
		this.entertainment = entertainment;
		this.luxury = luxury;
		this.other = other;
	}

	public int getBudgetAId() {
		return budgetAId;
	}

	public void setBudgetAId(int budgetAId) {
		this.budgetAId = budgetAId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public double getCcInterest() {
		return ccInterest;
	}

	public void setCcInterest(double ccInterest) {
		this.ccInterest = ccInterest;
	}

	public double getTransportation() {
		return transportation;
	}

	public void setTransportation(double transportation) {
		this.transportation = transportation;
	}

	public double getHousing() {
		return housing;
	}

	public void setHousing(double housing) {
		this.housing = housing;
	}

	public double getGrocery() {
		return grocery;
	}

	public void setGrocery(double grocery) {
		this.grocery = grocery;
	}

	public double getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(double entertainment) {
		this.entertainment = entertainment;
	}

	public double getLuxury() {
		return luxury;
	}

	public void setLuxury(double luxury) {
		this.luxury = luxury;
	}

	public double getOther() {
		return other;
	}

	public void setOther(double other) {
		this.other = other;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + budgetAId;
		long temp;
		temp = Double.doubleToLongBits(ccInterest);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(entertainment);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grocery);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(housing);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(luxury);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(other);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(transportation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		Budget_Actual other = (Budget_Actual) obj;
		if (budgetAId != other.budgetAId)
			return false;
		if (Double.doubleToLongBits(ccInterest) != Double.doubleToLongBits(other.ccInterest))
			return false;
		if (Double.doubleToLongBits(entertainment) != Double.doubleToLongBits(other.entertainment))
			return false;
		if (Double.doubleToLongBits(grocery) != Double.doubleToLongBits(other.grocery))
			return false;
		if (Double.doubleToLongBits(housing) != Double.doubleToLongBits(other.housing))
			return false;
		if (Double.doubleToLongBits(luxury) != Double.doubleToLongBits(other.luxury))
			return false;
		if (Double.doubleToLongBits(this.other) != Double.doubleToLongBits(other.other))
			return false;
		if (Double.doubleToLongBits(transportation) != Double.doubleToLongBits(other.transportation))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Budget_Actual [budgetAId=" + budgetAId + ", userId=" + userId + ", ccInterest=" + ccInterest
				+ ", transportation=" + transportation + ", housing=" + housing + ", grocery=" + grocery
				+ ", entertainment=" + entertainment + ", luxury=" + luxury + ", other=" + other + "]";
	}

}