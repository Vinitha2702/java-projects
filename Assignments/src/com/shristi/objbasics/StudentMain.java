package com.shristi.objbasics;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("vinitha","cse");
		student.printDetails();
		student.getGrades(100,90,80,90,100);
		
		Student student1=new Student("vyshu","cse");
		student1.printDetails();
		student1.getGrades(100,90,80,80,100);
	}

}
