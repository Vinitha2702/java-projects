package com.lumen.absdemos;

import java.util.Scanner;

import com.shiristi.inherdemos.Account;
import com.shiristi.inherdemos.AccountSavings;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter account type");
		String accountType=scanner.next();
		System.out.println("enter methodType");
		String methodType=scanner.next();
		System.out.println("enter balance");
		double balance1=scanner.nextInt();
		System.out.println("enter money");
		double money=scanner.nextInt();
		
		
		
		if(accountType.equals("savings")) {
			if(methodType.equals("withdraw")) {
				Account account=new AccountSavings(balance1);
				AccountSavings accountsavings=(AccountSavings)account;
				account.withdraw(money);
				account.getBalance();
				
				
			}else {
				Account account=new AccountSavings(balance1);
				account.deposit(money);
				
			}
		}
			
		else if(accountType.equals("current")) {
			
			if(methodType.equals("withdraw")) {
				Account account=new AccountSavings(balance1);
				account.withdraw(money);
				
			}else {
				Account account=new AccountSavings(balance1);
				account.deposit(money);
				
			}
			
		}
		
	}

}
