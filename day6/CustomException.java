package com.celcom.day6;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	int age;

	public InvalidAgeException(int age) {
		this.age = age;

	}

	@Override
	public String toString() {
		return age + "Invalid Age for Voting";
	}
}

public class CustomException {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age = new Scanner(System.in).nextInt();

		if (age > 18) {
			System.out.println("Welcome to Vote");
		} else {
			try {
				throw new InvalidAgeException(age);
			} catch (InvalidAgeException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
}
