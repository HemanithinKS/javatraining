package com.celcom.day5;

interface One {
	int a = 10; // by default interface variable public static and final
}

interface Two {
	int a = 20;
}

interface Three extends One, Two {
	void addition(); // public and abstract
}

class Addition implements Three {

	public void addition() {
		System.out.println(One.a + Two.a);

	}

}

public class InterfaceMultipleInheritanceExample {

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.addition();
	}

}
