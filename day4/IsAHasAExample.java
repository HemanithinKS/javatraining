package com.celcom.day4;

class Vehicle {
	void engine() {
		System.out.println("All vehicle has a One Engine");
	}

	void wheels() {
		System.out.println("All vehicle has a wheels");
	}
}

class Wheels {
	void wheelModel() {
		System.out.println("Whell Model is MRF");
	}

	void noOfWheels(String vehicleType) {
		if (vehicleType.equals("Two Wheeler")) {
			System.out.println("I have Two Wheeler");
		} else if (vehicleType.equals("Four Wheeler"))
			;
		{
			System.out.println("I have Four Wheeler");
		}
	}
}

class Engine {
	void engineModel() {
		System.out.println("Engine Model is XYZ");
	}

	void noOfEngine() {
		System.out.println("I have One Engine");
	}
}

class Car extends Vehicle { // IS-A
	Wheels wheel = new Wheels();
	Engine engine = new Engine();

	void engineModel() {
		engine.engineModel();
	}

	void wheelModel() {
		wheel.wheelModel();
	}

	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}

public class IsAHasAExample {

	public static void main(String[] args) {

		Car car = new Car();
		car.engine();
		car.engineModel();

		car.wheels();
		car.wheelModel();
		car.noOfWheels();

	}

}
