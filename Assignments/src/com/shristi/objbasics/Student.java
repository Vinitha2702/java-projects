package com.shristi.objbasics;

public class Student {

	String name;
	String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	void printDetails() {
		System.out.println("name"+name);
		System.out.println("department"+department);
	}
	int sum=0;
	int avg;
	String getGrades(int...marks) {
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		avg=sum/marks.length;
		if(avg>=90 && avg<=100) {
			System.out.println("A");
		}
		else if(avg>=80 && avg<90) {
			System.out.println("B");
		}
		else if(avg>=70 && avg<80) {
			System.out.println("C");
		}
		else if(avg>=60 && avg<70) {
			System.out.println("D");
		}
		else if(avg>=50 && avg<60) {
			System.out.println("E");
		}
		else {
			System.out.println("Fail");
		}
		return null;
		
	}

}
