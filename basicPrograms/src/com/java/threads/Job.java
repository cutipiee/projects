package com.java.threads;

public class Job implements Runnable {

	private PrintQueue pq;
	public Job(PrintQueue pq) {
		this.pq=pq;
	}
	@Override
	public void run() {
		System.out.printf("%s: Going to print a job\n",Thread.currentThread().getName());
		pq.printJob(new Object());
		System.out.printf("%s: The document has been printed\n",Thread.currentThread().getName());
	}

}
