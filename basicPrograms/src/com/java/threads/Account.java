package com.java.threads;

public class Account {

	private Double balance;

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public synchronized void addAmount(Double amount) {
		double temp = balance;
		try {
			Thread.sleep(10);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		temp += amount;
		balance = temp;

	}

	public synchronized void subAmount(Double amount) {
		double temp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		temp -= amount;
		balance = temp;

	}
}
