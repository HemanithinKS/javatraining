package com.celcom.Bank;


import java.util.Scanner;

public class Portal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountList bank = new AccountList();
        Admin admin = new Admin(bank);

        while (true) {
            System.out.println("\n====== WELCOME TO THE BANK PORTAL ======");
            System.out.println("1. Customer Login");
            System.out.println("2. Admin Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Bank.customerMenu(bank);
                    break;
                case 2:
                    admin.adminMenu();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
