package com.celcom.Bank;

import java.util.Scanner;

public class Bank {
	
    public static void customerMenu(AccountList bank) {
    	Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n======== CUSTOMER MENU ========");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bank.setData();
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double depAmt = sc.nextDouble();
                    bank.deposit(depAcc, depAmt);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withAmt = sc.nextDouble();
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    bank.withDraw(withAcc, withAmt, pin);
                    break;

                case 4:
                    System.out.print("Enter Your Account Number: ");
                    int accNum = sc.nextInt();
                    bank.getCurrentAccountDetails(accNum);
                    break;

                case 5:
                    System.out.print("Enter Your Account Number: ");
                    int txnAcc = sc.nextInt();
                    AccountDetails account = bank.findAccount(txnAcc);
                    if (account != null) account.displayTransactionHistory();
                    else System.out.println("Account not found.");
                    break;

                case 6:
                    System.out.println("Exiting Customer Menu...");
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
