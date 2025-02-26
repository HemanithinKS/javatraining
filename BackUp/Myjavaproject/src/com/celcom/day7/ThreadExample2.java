package com.celcom.day7;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My Thread Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample2 {
	public static void main(String[] args) throws InterruptedException  {
		MyThread t1 = new MyThread();
		System.out.println(t1.getState());//new
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.start(); //Starting or running my thread T1
		
		Thread.sleep(3000);
		
		System.out.println("MAIN END");
	
	}
}
