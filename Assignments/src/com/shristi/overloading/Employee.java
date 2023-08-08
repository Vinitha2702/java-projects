package com.shristi.overloading;

public class Employee {
	
	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	double calcBonus(double basicAllowance) {
		double bonus = basicAllowance * 0.1;
		return bonus;
	}
	double calcBonus(double basicAllowance,double carAllowance) {
		double bonus = (basicAllowance + carAllowance) * 0.15;
		return bonus;
	}
	double calcBonus(double basicAllowance,double carAllowance,double houseAllowance) {
		double bonus = (basicAllowance + carAllowance+ houseAllowance)*0.2;
		return bonus;
	}
}


