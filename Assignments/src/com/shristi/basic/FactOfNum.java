package com.shristi.basic;

public class FactOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}

}
