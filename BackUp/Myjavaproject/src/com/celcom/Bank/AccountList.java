package com.celcom.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AccountList {
	private List<AccountDetails> bank = new ArrayList<>();

	AccountDetails findAccount(int accountNumber) {
		for (AccountDetails account : bank) {
			if (account.accountNumber == accountNumber) {
				return account;
			}
		}
		return null;
	}

	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number, Holder Name, Branch Name, Phone Number, and PIN:");

		int accountNumber = sc.nextInt();
		String accountHolderName = sc.next();
		long phoneNumber = sc.nextLong();
		int pin = sc.nextInt();

		if (findAccount(accountNumber) != null) {
			System.out.println("Account Already Exists.");
			return;
		}

		AccountDetails account = new AccountDetails(accountNumber, accountHolderName, phoneNumber, 0, pin);
		bank.add(account);
		System.out.println("Account Created Successfully.");
	}

	public void deposit(int accountNumber, double amount) {
		AccountDetails account = findAccount(accountNumber);
		if (account != null) {
			account.deposit(amount);
			System.out.println("Amount successfully deposited.");
		} else {
			System.out.println("Account not found.");
		}
	}

	public void withDraw(int accountNumber, double amount, int pin) {
		AccountDetails account = findAccount(accountNumber);
		if (account != null) {
			if (account.pin == pin) {
				if (account.withDraw(amount)) {
					System.out.println("Amount successfully withdrawn.");
				} else {
					System.out.println("Insufficient balance.");
				}
			} else {
				System.out.println("Incorrect PIN.");
			}
		} else {
			System.out.println("Account not found.");
		}
	}

	public void getCurrentAccountDetails(int accountNumber) {
		AccountDetails account = findAccount(accountNumber);
		if (account != null) {
			System.out.println("Account Holder Name: " + account.accountHolderName);
			System.out.println("Account Number: " + account.accountNumber);
			System.out.println("Phone Number: " + account.phoneNumber);
			System.out.println("Account Balance: $" + account.balance);
		} else {
			System.out.println("Account not found.");
		}
	}

	public void getAllAccountDetails() {
		for (AccountDetails account : bank) {
			System.out.println("Account Holder Name: " + account.accountHolderName);
			System.out.println("Account Number: " + account.accountNumber);
			System.out.println("Phone Number: " + account.phoneNumber);
			System.out.println("Account Balance: $" + account.balance);
			System.out.println("------------------------");
		}
	}

	public boolean removeAccount(int accountNumber) {
		for (AccountDetails account : bank) {
			if (account.accountNumber == accountNumber) {
				bank.remove(account);
				return true;
			}
		}
		return false;
	}
}
