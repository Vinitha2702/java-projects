package com.shristi.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1234;
		int remainder;
		int result=0;
		while(number!=0) {
			remainder=number%10;
			result=result*10+remainder;
			number=number/10;
			
		}
		System.out.println(result);
	}

}
