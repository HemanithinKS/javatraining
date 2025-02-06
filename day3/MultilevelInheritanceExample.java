package com.celcom.day3;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have two Wheels");
	}
}

class Bike extends TwoWheeler {
	void brandName() {
		System.out.println("My Brand Name is HONDA");
	}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		Bike honda = new Bike();
		honda.noOfWheels();
		honda.noOfEngine();
		honda.brandName();
		
		
}
}
