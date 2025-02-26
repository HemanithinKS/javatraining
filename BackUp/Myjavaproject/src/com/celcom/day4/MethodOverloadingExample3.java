package com.celcom.day4;

public class MethodOverloadingExample3 {
	void concat(int a, int b) {
		System.out.println("Integer concat: " + a + b);
	}

	void concat(double a,  double b) {
		System.out.println("Double concat: " + a + b);
	}
	
	void concat(String a, String b) {
		System.out.println("Sring concat: " + a + b);
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample3 obj = new MethodOverloadingExample3();
		obj.concat(10.4, 11.2);
		obj.concat(10, 11);
		obj.concat("ac", "bd");
}
}