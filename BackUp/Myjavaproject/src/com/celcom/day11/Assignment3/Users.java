package com.celcom.day11.Assignment3;

import java.util.Scanner;

public class Users {
public static void main(String[] args) {
	User obj = new User();
	Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println();
		System.out.println("\nMicrovave Time Calculate System");
		System.out.println("1. Add User");
		System.out.println("2. View User");
		System.out.println("3. Calculate");
		System.out.println("4. Exit");
		System.out.println("Enter your choice: ");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			obj.addnew();
			break;
		case 2:
			obj.viewUser();
			break;
		case 3:
			int userid=sc.nextInt();
			obj.calculateTime(userid-1);
			break;
		case 4:
			System.out.println("Exiting . Goodbye!");
			return;
		default:
			System.out.println("Invalid choice! ");
		}
	}
}
}
