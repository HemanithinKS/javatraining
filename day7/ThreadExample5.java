package com.celcom.day7;


class TwoTable extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("2 * " + i + " = " + (i * 2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class FiveTable implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.err.println("5 * " + i + " = " + (i * 5));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample5 {
	public static void main(String[] args) throws InterruptedException {
		TwoTable two = new TwoTable();
		Thread five = new Thread(new FiveTable());
		
		two.start();
		System.out.println("Main 1");
		
		two.join();
		System.out.println("Main 2");
		five.start();
		

	}
}
