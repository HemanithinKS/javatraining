package com.celcom.day7;

public class ThreadLamda {
public static void main(String[] args) {
	Runnable runnable =( )->{
			for (int i = 0; i <5; i++) {
				System.out.println("Thread is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		
	};
	
	
	
	Thread t2 = new Thread(runnable);
	t2.start();
}
}
