package com.celcom.day7;

class MyThread2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Thread Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample4 {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MyThread2());
		t1.setName("T1");

		Thread t2 = new Thread(new MyThread2());
		t2.setName("T2");

		t1.start(); // Starting or running my thread T1
		t2.start(); // Starting or running my thread T2

	}
}
