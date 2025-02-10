package com.celcom.day5;


import java.util.List;

import java.util.ArrayList;


class Account {

    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

public class AssignmentBank {
    static List<Account> accounts = new ArrayList<>();


    static void addAccount(Account account) {
        accounts.add(account);
    }

    static void removeAccount(Account account) {
        accounts.remove(account);
    }

    public static void main(String[] args) {
        Account a1 = new Account("12345", 1000);
        addAccount(a1);
        a1.deposit(500);
        a1.withdraw(200);
        System.out.println(a1.balance);
    }
}

