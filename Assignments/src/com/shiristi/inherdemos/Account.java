package com.shiristi.inherdemos;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			double total=balance-=amount;
			System.out.println(balance);
			System.out.println(total);
		}
		else {
			System.out.println("insuffiecient amount");
		}
		
	}
	void deposit(double amount) {
		if(amount>0) {
			double total=balance+=amount;
			System.out.println("deposited successfully");
			System.out.println(total);
		}
		else {
			System.out.println("invalid");
		}
	}
	double getBalance() {
		return balance;
	}
}
