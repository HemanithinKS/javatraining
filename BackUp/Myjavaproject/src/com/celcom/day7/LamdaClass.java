package com.celcom.day7;

interface Calculator{
	int calc(int a ,int b);
}
public class LamdaClass {
public static void main(String[] args) {
	Calculator c=(a,b) -> a+b;
	c.calc(10,20);
}
}
