package com.celcom.day3;

class Vehicle2 {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler2 extends Vehicle2 {
	void noOfWheels() {
		System.out.println("I have two Wheels");
	}
}

class Bike2 extends TwoWheeler2 {
	void brandName() {
		System.out.println("My Brand Name is HONDA");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		TwoWheeler2 two = new TwoWheeler2();
		two.noOfWheels();
		two.noOfEngine();
	}
}
