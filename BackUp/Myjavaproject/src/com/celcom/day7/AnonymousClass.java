package com.celcom.day7;

interface myInterface {
	void display();
}

//public class AnonymousClass implements myInterface {
//
//	public void display() {
//		System.out.println("Annoyms Inner Class");
//
//	}
public class AnonymousClass {
	public static void main(String[] args) {
//		AnonymousClass obj = new AnonymousClass();
//		obj.display();

		myInterface obj1 = new myInterface() {

			public void display() {
				System.out.println("display");

			}
		};
		
		obj1.display();
		
	}
}
