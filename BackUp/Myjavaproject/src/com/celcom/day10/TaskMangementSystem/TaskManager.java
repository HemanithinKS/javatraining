package com.celcom.day10.TaskMangementSystem;

import java.util.Scanner;

public class TaskManager {

	public void showMenu() throws InterruptedException {
		TasksFunctions obj = new TasksFunctions();
		Scanner sc = new Scanner(System.in);
		while (true) {
			Thread.sleep(2000);
			System.out.println();
			System.out.println("\nTask Management System");
			System.out.println("1. Add Task");
			System.out.println("2. View All Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Delete Task");
			System.out.println("5. Search Task");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.addTask();
				break;
			case 2:
				obj.viewTask();
				break;
			case 3:
				obj.completeTask();
				break;
			case 4:
				obj.removeTask();
				break;
			case 5:
				obj.searchTask();
				break;
			case 6:
				System.out.println("Exiting Task Management System. Goodbye!");
				return;
			default:
				System.out.println("Invalid choice! ");
			}
		}

	}
}
