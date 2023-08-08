package com.shristi.basic;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=153;
		
		
		
		int remainder;
		int result=0;
		int number1;
		number1=number;
		while(number1!=0) {
			remainder=number1%10;
			result+=Math.pow(remainder,3);
			number1=number1/10;
			
			
		}
		if(result== number) {
			System.out.println(number+"Amstrong number");
		}
		else {
			System.out.println(number+"not an Amstrong number");
		}
	}

}
