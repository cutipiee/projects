package com.java.threads;

public class Bank implements Runnable {

	Account account;

	public Bank(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.subAmount(500d);

		}

	}

}
