package com.celcom.day4;

public class MethodOverloadingExample2 {
	
	void addition(int a, int b) {
		System.out.println("Integer Addition: " + (a+b));
	}

	void addition(double a,  double b) {
		System.out.println("Double Addition: " + (a+b));
	}
	
	void addition(long a, long b) {
		System.out.println("Long Addition: " + (a+b));
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample2 obj = new MethodOverloadingExample2();
		obj.addition(10.4, 11.2);
		obj.addition(10, 11);
		obj.addition(15L, 14L);
		
	}

}
