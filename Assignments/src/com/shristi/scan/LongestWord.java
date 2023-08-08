package com.shristi.scan;
import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence=scanner.nextLine();
		String[] words = sentence.split(" ");
		int length = 0;
		String longest_word="";
        
        for(int i=0;i<words.length;i++){
        	String word=words[i];
        	int len = word.length();
            if(len>length){
                length=len;
                longest_word=word;
            }
        }
        System.out.println(longest_word);
	}

}
