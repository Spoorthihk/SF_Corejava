package com.tnif.bankSystem;

public class Main {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA123", 500.0, 200.0);

        Bank.addAccount(savingsAccount);
        Bank.addAccount(checkingAccount);

        savingsAccount.addInterest();
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        
        checkingAccount.deposit(300);
        checkingAccount.withdraw(700);

        Bank.displayAllAccounts();
		// TODO Auto-generated method stub

	}

}
