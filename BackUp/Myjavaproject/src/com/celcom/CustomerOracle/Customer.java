package com.celcom.CustomerOracle;

public class Customer {
	private String Name;
	private String Dob;
	private String address;
	private String fatherName;
	private long aadharNumber ;
	private int PhoneNumber;
	Customer(String name, String dob, String address, String fatherName, long aadharNumber, int phoneNumber) {
		super();
		Name = name;
		Dob = dob;
		this.address = address;
		this.fatherName = fatherName;
		this.aadharNumber = aadharNumber;
		PhoneNumber = phoneNumber;
	}
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	String getDob() {
		return Dob;
	}
	void setDob(String dob) {
		Dob = dob;
	}
	String getAddress() {
		return address;
	}
	void setAddress(String address) {
		this.address = address;
	}
	String getFatherName() {
		return fatherName;
	}
	void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	long getAadharNumber() {
		return aadharNumber;
	}
	void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	int getPhoneNumber() {
		return PhoneNumber;
	}
	void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	
	
	
	
	

	
	
	
}
