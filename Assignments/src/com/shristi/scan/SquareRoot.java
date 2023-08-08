package com.shristi.scan;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len;
		Scanner scanner=new Scanner(System.in);
		len=scanner.nextInt();
		int arr[]=new int[len];
		int sum=0;
		for(int i=0;i<len;i++) {
			arr[i]=scanner.nextInt();
		}
		double arr1[]=new double[len];
		double result;
		for(int i=0;i<len;i++) {
			result=Math.sqrt(arr[i]);
			arr1[i]=result;
			
		}
	}

}
