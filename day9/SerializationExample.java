package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	transient private int eid;
	private String ename;
	private double salary;

	Employee(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee nithin = new Employee(22, "nithin", 37000);

		FileOutputStream fout = new FileOutputStream("D://ObjectFile.txt");

		// Serialization
		ObjectOutputStream obj = new ObjectOutputStream(fout);
		obj.writeObject(nithin);
		fout.close();
		obj.close();
		System.out.println("Object Saved");

		// De-Serialization
		FileInputStream fin = new FileInputStream("D://ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp=(Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
		

	}

}
