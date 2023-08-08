package com.shristi.basic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstTerm = 0,secondTerm = 1;
		int number=8;
		for(int i=0;i<=number;i++) {
			int nextTerm=firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm= nextTerm;
			System.out.println(firstTerm);
			
		}
		
	}

}
