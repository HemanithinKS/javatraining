package com.celcom.day3;

class Vehicle4 {
	String name = "I am a super class variable";

	Vehicle4() {
		System.out.println("I am a super class constructor");
	}

	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler4 extends Vehicle4 {
	TwoWheeler4() {
		super();
	}

	void noOfEngine() {
		super.noOfEngine();
		System.out.println("I have Two Wheels");
		System.out.println(super.name);
	}

}

public class SuperKeyword {
	public static void main(String[] args) {
		TwoWheeler4 two = new TwoWheeler4();

		two.noOfEngine();
	}

}
