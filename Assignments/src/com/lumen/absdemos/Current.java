package com.lumen.absdemos;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("withdraw success");
			
			}
			else {
				System.out.println("insufficient");
			}
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Deposited success");
			}
			else {
				System.out.println("invalid");
			}
	}

}
