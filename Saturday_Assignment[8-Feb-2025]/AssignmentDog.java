package com.celcom.assignment1;

class Dog {
	String name, breed;

	Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	void setName(String name) {
		this.name = name;
	}

	void setBreed(String breed) {
		this.breed = breed;
	}
}

public class AssignmentDog {

	public static void main(String[] args) {

		Dog obj = new Dog("Jimmy", "Pug");
		System.out.println(obj.name + " " + obj.breed);

		obj.setName("Barco");
		obj.setBreed("Dobber");

		System.out.println(obj.name + " " + obj.breed);

	}

}
