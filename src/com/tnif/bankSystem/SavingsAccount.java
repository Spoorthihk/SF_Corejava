package com.tnif.bankSystem;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            return super.withdraw(amount);
        } else {
            System.out.println("Invalid or exceeds overdraft limit for withdrawal");
            return false;
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
