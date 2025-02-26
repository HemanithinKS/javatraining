package com.celcom.day7;

import java.util.Scanner;

//Inter-Thread Communication 2
class SavingAccount {
	private double money;

	public double getMoney() {
		return money;
	}

	public void deposit(double deposit) {
		this.money = money + deposit;
	}

	public void withdraw(double withdraw) {
		this.money = money - withdraw;
	}

}

class Deposit extends Thread {
	SavingAccount savingAccount;

	Deposit(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	@Override
	public void run() {
		synchronized (savingAccount) {
			System.out.println("Depositer Started to put monney");
			System.out.println("Enter the money");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.deposit(amount);
			System.out.println(amount + " is added");
			System.out.println("Balance " + savingAccount.getMoney() );
			savingAccount.notify();
		}
	}
}

class WithDraw extends Thread {
	SavingAccount savingAccount;

	WithDraw(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	@Override
	public void run() {
		synchronized (savingAccount) {
			System.out.println("Waiting for the monry to be deposited");
			try {
				savingAccount.wait();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println("Enter the amount to withdrawn: ");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.withdraw(amount);
			System.out.println(amount + " is withdrawn");
			System.out.println("Balance " + savingAccount.getMoney() );
			
		}
	}
}

public class InterThreadCommunication2 {

	public static void main(String[] args) throws InterruptedException {
		SavingAccount obj = new SavingAccount();
		Deposit obj1 = new Deposit(obj);
		WithDraw obj2 = new WithDraw(obj);
		obj2.start();

		Thread.sleep(20000);
		obj1.start();
	}

}
