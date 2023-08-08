package com.shiristi.inherdemos;

public class AccountSavings extends Account {

	public AccountSavings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0 && amount<=balance) {
			if(getBalance()-amount>=1000)
				balance=balance-amount;
			System.out.println("withdraw success");
		}
		else {
			System.out.println("insufficient balance");
		}
		
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance=balance+amount;
		System.out.println("deposited successful");
		}
		else {
			System.out.println("invalid");
		}
	}
		

}
