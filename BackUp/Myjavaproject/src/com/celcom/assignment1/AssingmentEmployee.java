package com.celcom.assignment1;

class Employee {

	String name, jobTitle;
	double salary;

	Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	void updateSalary(double amount) {
		salary += amount;
	}
}

public class AssingmentEmployee {
	public static void main(String[] args) {
		Employee e = new Employee("John", "Developer", 50000);
		e.updateSalary(5000);
		System.out.println(e.salary);
	}
}
