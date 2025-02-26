package com.celcom.practice;

class Vehicle {
	String name = "I am a super class variable";

	Vehicle() {
		System.out.println("I am a super class constructor");
	}

	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle {
	TwoWheeler() {
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
		TwoWheeler two = new TwoWheeler();

		two.noOfEngine();
	}

}
