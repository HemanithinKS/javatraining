package com.celcom.day7;

public class LambdaMultiple {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnablee = new Runnable() {
            @Override
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
        };

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.err.println("5 * " + i + " = " + (i * 5));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(runnablee); // Thread for "2 * i"
        Thread t2 = new Thread(runnable); // Thread for "5 * i"

        System.out.println("Main 1");
        t1.start();
        t2.start();
        System.out.println("Main 2");
    }
}
