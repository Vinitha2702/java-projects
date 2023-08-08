package com.shristi.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=496;
		int sum=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		if(sum==number) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
	}

}
