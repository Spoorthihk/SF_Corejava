package com.tnif.bankSystem;
import java.util.HashMap;
import java.util.Map;
class Bank {


    private static Map<String, Account> accounts = new HashMap<>();

    public static void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public static Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public static void displayAllAccounts() {
        for (Account account : accounts.values()) {
            account.displayAccountInfo();
            System.out.println();
        }
    }
}

