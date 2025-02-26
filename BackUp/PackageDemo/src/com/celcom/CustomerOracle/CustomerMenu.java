package com.celcom.CustomerOracle;

import java.util.Scanner;

public class CustomerMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerFunction obj = new CustomerFunction();
		while (true) {
			int choice = sc.nextInt();
			System.out.println("Customer Management System");
			System.out.println("1.View All Customer");
			System.out.println("2.Add Customer");
			System.out.println("3.Edit Custome");
			System.out.println("4.remove Customer");
			System.out.println("5.Exit");

			switch (choice) {
			case 0:
				obj.createTable();
				break;
			case 1:
				obj.viewallCustomer();
				break;

			case 2:
				obj.addCustomer();
				break;
			case 3:
				obj.editCustomerById();
				;
				break;
			case 4:
				obj.removeCustomerById();
				break;
			case 5:
				return;

			default:
				break;
			}
		}
	}
}
