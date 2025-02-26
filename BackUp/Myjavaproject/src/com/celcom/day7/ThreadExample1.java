package com.celcom.day7;

public class ThreadExample1 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
//		t.setPriority(7);
		System.out.println(t);
		
		System.out.println("Current Thread Name :" +t.getName());// Main
		System.out.println("Current Thread Priority :" +t.getPriority());// 5
		System.out.println("Current Thread ID :" +t.getId());// 1
		
	}
}
