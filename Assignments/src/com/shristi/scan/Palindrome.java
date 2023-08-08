package com.shristi.scan;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int remainder;
		int result=0;
		int original=number;
		while(original!=0) {
			remainder=original%10;
			result=result*10+remainder;
			original=original/10;
		}
		if(result==number) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
