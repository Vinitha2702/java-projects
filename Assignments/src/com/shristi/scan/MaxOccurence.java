package com.shristi.scan;
import java.util.Scanner;

public class MaxOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String word=scanner.next();
		String[] words=word.split(",");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])){
					
				}
			}
		}
	}

}
