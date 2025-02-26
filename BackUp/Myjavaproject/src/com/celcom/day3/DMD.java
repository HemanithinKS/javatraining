package com.celcom.day3;

class Vehical {

}

class Bike extends Vehical {

}

class Car extends Vehical {

}

public class DMD {

	public static void main(String[] args) {

		Vehical vec = new Bike(); // DMD

		vec = new Car();

	}
}
