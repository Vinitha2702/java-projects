package com.shristi.overloading;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("vinitha","Manager");
		double employee1Bonus=employee.calcBonus(2000.0);
		double employee2Bonus=employee.calcBonus(3000.0,500.0);
		double employee3Bonus=employee.calcBonus(2500.0,400.0,600.0);
		
		System.out.println("employee1"+employee1Bonus);
		System.out.println("employee2"+employee2Bonus);
		System.out.println("employee3"+employee3Bonus);
	}

}
