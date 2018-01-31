package com.java.threads;

public class BankMain {

	public static void main(String args[]) {
		Account account = new Account();
		account.setBalance(1000d);
		Company comapny = new Company(account);
		Thread companyThread = new Thread(comapny);
		Bank bank = new Bank(account);
		Thread bankThread = new Thread(bank);

		System.out.printf("Account: Intial Balance: %f\n", account.getBalance());

		try {
			companyThread.start();
			bankThread.start();
			companyThread.join();
			bankThread.join();
			System.out.printf("Account: Final Balance: %f\n", account.getBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
