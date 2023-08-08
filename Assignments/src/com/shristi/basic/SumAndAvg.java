package com.shristi.basic;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		double avg;
		for(var arr:array) {
			sum+=arr;
		}
		avg=sum/2;
		System.out.println(sum);
		System.out.println(avg);
	}

}
