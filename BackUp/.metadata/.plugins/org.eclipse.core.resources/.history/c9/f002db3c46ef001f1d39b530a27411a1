package com.celcom.Bank;

import java.util.ArrayList;
import java.util.List;

public class AccountDetails {
    int accountNumber;
    String accountHolderName;
    String branchName;
    long phoneNumber;
    double balance;
    int pin;
    List<String> transactionHistory;

    public AccountDetails(int accountNumber, String accountHolderName, String branchName, long phoneNumber, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.branchName = branchName;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.pin = pin;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: $" + amount);
    }

    public boolean withDraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            return true;
        } else {
            return false;
        }
    }

    public void displayTransactionHistory() {
        System.out.println("\nTransaction History for Account " + accountNumber);
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
        System.out.println("------------------------");
    }
}
