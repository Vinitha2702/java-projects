package com.shristi.basic;


public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,4,2,3,4,5,1};
		int len=array.length;
		int count=0;
		for(var i=0;i<=len-1;i++) {
			for(var j=i+1;j<=len-1;j++) {
				if(array[i]==array[j]) {
					count+=1;
				}
			}
		}
		System.out.println(count);
	}

}
