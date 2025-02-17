//package com.celcom.day10;
//
//class Goods {
//	private String itemName;
//	private int itemQuantity;
//	private double price;
//
//	String getItemName() {
//		return itemName;
//	}
//
//	void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
//
//	int getItemQuantity() {
//		return itemQuantity;
//	}
//
//	void addItemQuantity(int add) {
//		this.itemQuantity += add;
//	}
//
//	void removeItemQuantity(int remove) {
//		this.itemQuantity -= remove;
//	}
//
//	double getPrice() {
//		return price;
//	}
//
//	void setPrice(double price) {
//		this.price = price;
//	}
//}
//
//class Producer implements Runnable {
//	private Goods item;
//
//	public Producer(Goods item) {
//		this.item = item;
//	}
//
//	@Override
//	public void run() {
//		synchronized (item) {
//			System.out.println("Item is in production...");
//			item.setItemName("Pencil");
//			item.addItemQuantity(2);
//			item.setPrice(20);
//			System.out.println("Item is produced.");
//
//			item.notify();
//		}
//	}
//}
//
//class Consumer implements Runnable {
//	private Goods item;
//
//	Consumer(Goods item) {
//		this.item = item;
//	}
//
//	@Override
//	public void run() {
//		synchronized (item) {
//			try {
//				System.out.println("Waiting for production...");
//				item.wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//			System.out.println(item.getItemQuantity() + " " + item.getItemName() + " bought for "
//					+ (item.getItemQuantity() * item.getPrice())+ " ruppes");
//			item.removeItemQuantity(item.getItemQuantity());
//		}
//	}
//}
//
//public class InterThreadCommunication {
//	public static void main(String[] args) throws InterruptedException {
//		Goods item = new Goods();
//		Thread consumer = new Thread(new Consumer(item));
//		Thread producer = new Thread(new Producer(item));
//
//		consumer.start();
//		Thread.sleep(5000);
//		producer.start();
//	}
//}
//
//
package com.celcom.day10;
 
import java.util.LinkedList;
import java.util.List;
 
class SharedBuffer {
    private List<Integer> buffer = new LinkedList<>();
    private final int capacity = 10;
 
    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notifyAll();
        }
    }
 
    public int consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }
            int item = buffer.remove(0);
            System.out.println("Consumed: " + item);
            notifyAll();
            return item;
        }
    }
}
 
class Producer implements Runnable {
    private SharedBuffer buffer;
 
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
 
    @Override
    public void run() {
        int item = 0;
        try {
            while (true) {
                buffer.produce(item++);
                Thread.sleep(100); // Simulate time taken to produce
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
 
class Consumer implements Runnable {
    private SharedBuffer buffer;
 
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
 
    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
 
public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
 
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
 
        producerThread.start();
        consumerThread.start();
    }
}
 