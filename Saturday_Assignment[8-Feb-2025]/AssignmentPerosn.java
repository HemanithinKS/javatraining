package com.celcom.assignment1;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class AssignmentPerosn {
	public static void main(String[] args) {
		Person p1 = new Person("Nithin", 22);
		Person p2 = new Person("Ram", 29);

		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
	}

}
