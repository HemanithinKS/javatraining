package com.celcom.day8;

public class StringMethodsExample1 {
	public static void main(String[] args) {
		String s1 = "Java";

		System.out.println(s1.length());// 4

		System.out.println(s1.charAt(1));// a

		System.out.println(s1.toLowerCase());// java
		System.out.println(s1.toUpperCase());// JAVA

		System.out.println(s1.concat("world"));// Java World

		System.out.println(s1.replace('a', 'z'));// Jzvz

		System.out.println(s1.equals("java"));// false
		System.out.println(s1.equalsIgnoreCase("java"));// true

		System.out.println(s1.contains("ava"));// true

		System.out.println(s1.startsWith("Ja"));// true(case sensitive)
		System.out.println(s1.endsWith("va"));// true(case sensitive)

		String s2 = "Java World";
		System.out.println(s2.substring(2));// va World
		System.out.println(s2.substring(2, 7));// va Wo note last index will not be printed

	}
}
