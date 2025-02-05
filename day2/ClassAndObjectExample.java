package com.celcom.day2;


class Employee{
	int eid;
	String ename;
	double esalary; 
	
	//Constructor
	Employee(int eid, String ename, double esalary){
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	
	//Method
	void display() {
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
		
	}
}
public class ClassAndObjectExample {
	public static void main(String[] args) {
		Employee nithin = new Employee(16, "nithin", 15000);
		nithin.display();
		
		Employee bharat = new Employee(16, "bharat", 15000);
		bharat.display();
		
	}

}
