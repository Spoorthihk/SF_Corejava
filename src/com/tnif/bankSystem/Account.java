package com.tnif.bankSystem;

public abstract class Account {
	private String accountNumber;
	private double balance;
	public Account(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			
		}else {
			System.out.println("invalid deposit");
		}
	}
	public boolean withdraw(double amount) {
		if (amount>0 && amount<=balance) {
			balance -=amount;
			return true;
		}else {
			System.out.println("invalid or insufficient");
			return false;
		}
	}
	public abstract void displayAccountInfo();

}
