package com.celcom.day4;

class SuperClass {
	void myMethod() {
		System.out.println("I am from Super Class");
	}
	
}

class SubClass extends SuperClass {
	void myMethod() {
		System.out.println("I am from Sub Class");
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.myMethod();
		
		SuperClass obj1 = new SubClass();
		obj1.myMethod();
	}
}
