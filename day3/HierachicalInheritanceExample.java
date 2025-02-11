package com.celcom.day3;

class Vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle {
	void noOfWheels() {
		System.out.println("I have two Wheels");
	}
}

class Bike1 extends TwoWheeler {
	void brandName() {
		System.out.println("My Brand Name is HONDA");
	}
}

class Scooty extends TwoWheeler {
	void brandName() {
		System.out.println("My Brand Name is ACTIVA");
	}
}

public class HierachicalInheritanceExample {

	public static void main(String[] args) {
		Bike1 honda = new Bike1();
		honda.noOfWheels();
		honda.noOfEngine();
		honda.brandName();

		Scooty activa = new Scooty();
		activa.noOfWheels();
		activa.noOfEngine();
		activa.brandName();

	}
}
