package com.shristi.basic;

public class ReverseStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		for(int i=number;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
