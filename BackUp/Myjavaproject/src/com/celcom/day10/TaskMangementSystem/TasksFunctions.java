package com.celcom.day10.TaskMangementSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.Scanner;

public class TasksFunctions {
	private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
	public void viewTask()
	{
		if (tasks.isEmpty()) {
			System.out.println("No Tasks");
			return;
		} else {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i+1)+ " -> "+tasks.get(i));
			}
		}
	}
	
	public void removeTask()
	{
		if (tasks.isEmpty()) {
			System.out.println("No Tasks to Remove");
			return;
		} else {
			System.out.println("Enter the Task Number to be removed");
			int index =sc.nextInt();
			if (index>0 && index <= tasks.size()) {
				System.out.println("Removed "+tasks.get(index-1));
				tasks.remove(index-1);
				
			} else {
				System.out.println("Enter a Valid Index");
			}
			}
		
	}
	
    public void addTask() {
        System.out.print("Enter task name: ");
        String name = sc.nextLine();
        LocalDateTime now = LocalDateTime.now(); 
        tasks.add(new Task(name, now));
        System.out.println("Task added successfully!");
    }
	
	public void completeTask() {
	       
	        if (tasks.isEmpty()) return;

	        System.out.print("Enter task number to mark as completed: ");
	        int index = sc.nextInt();

	        if (index > 0 && index <= tasks.size()) {
	            tasks.get(index - 1).markCompleted();
	            System.out.println(tasks.get(index-1));
	        } else {
	            System.out.println("Invalid task number.");
	        }
	}
	
	public void searchTask() {
	    System.out.print("Enter task name to search: ");
        String searchName = sc.nextLine();

        System.out.println("\nSearch Results:");
        boolean found = false;
        for (Task task : tasks) {
            if (task.getTaskName().contains(searchName)) {
            	System.out.println("Task found");
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching tasks found.");
        }
	}
	
	  
}
