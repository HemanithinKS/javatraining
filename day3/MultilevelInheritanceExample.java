package com.celcom.day3;

class Vehicle3 {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler3 extends Vehicle3 {
	void noOfWheels() {
		System.out.println("I have two Wheels");
	}
}

class Bike3 extends TwoWheeler3 {
	void brandName() {
		System.out.println("My Brand Name is HONDA");
	}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		Bike3 honda = new Bike3();
		honda.noOfWheels();
		honda.noOfEngine();
		honda.brandName();

	}
}
