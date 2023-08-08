package com.shristi.basic;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=25;
		int min=array[0];
		for(var arr:array) {
			if(min>arr) {
				min=arr;
			}
		}
		System.out.println(min);
	}

}
