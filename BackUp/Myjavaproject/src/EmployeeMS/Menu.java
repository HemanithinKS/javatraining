package EmployeeMS;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeManager obj = new EmployeeManager();

		while (true) {
			System.out.println("\nEmployee Management System");
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. REMOVE EMPLOYEE");
			System.out.println("3. EDIT EMPLOYEE DETAILS");
			System.out.println("4. QUERY EMPLOYEE AGE");
			System.out.println("5. SEARCH EMPLOYEE");
			System.out.println("6. VIEW ALL EMPLOYEES");
			System.out.println("7. EXIT");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.addEmployee();
				break;
			case 2:
				obj.removeEmployee();
				break;
			case 3:
				obj.editEmployee();
				break;
			case 4:
				obj.ageEmployee();
				break;
			case 5:
				obj.searchEmployee();
				break;
			case 6:
				obj.viewEmployee();
				break;
			case 7:
				System.out.println("Exiting Employee Management System. Goodbye!");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
