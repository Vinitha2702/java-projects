package com.shristi.scan;
import java.util.Scanner;

public class SumAndAvg {

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
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(sum);
		}
		int avg=sum/len;
		System.out.println(avg);
		
				
	}

}
