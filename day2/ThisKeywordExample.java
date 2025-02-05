package com.celcom.day2;


class Employee1{
	int eid;
	String ename;
	double esalary; 
	
	//Constructor
	Employee1(int eid, String ename, double esalary){
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
public class ThisKeywordExample {
	public static void main(String[] args) {
		Employee1 nithin = new Employee1(16, "nithin", 15000);
		nithin.display();
		
		Employee1 bharat = new Employee1(16, "bharat", 15000);
		bharat.display();
		
	}

}
