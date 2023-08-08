package com.lumen.basics;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] users = new String[] {"vinitha","lavanya","siri","nandini"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter username");
		String name=scanner.nextLine();
		boolean flag=true;
		for(int i=0;i<users.length;i++) {
			if(users[i].equals(name)) {
				flag=false;
				System.out.println("you are logged in suuccessfully");
			}
			
			}
		if(flag) {
			System.out.println("invalid username");
		}
		
		
				
		

	}
}
