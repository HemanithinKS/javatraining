package com.celcom.day6;

public class ObjectAssignExample {
	public static void main(String[] args) {
		ObjectAssignExample obj1 = new ObjectAssignExample();
		System.out.println(obj1);
		System.out.println(obj1.hashCode());

		ObjectAssignExample obj2 = obj1; // Object Assignment

		System.out.println(obj2);
		System.out.println(obj2.hashCode());

	}
}

