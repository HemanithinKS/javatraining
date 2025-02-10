package com.celcom.day5;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class AssignmentAnimal {
	   public static void main(String[] args) {
	        Cat c = new Cat();
	        c.makeSound();
	    }
}
