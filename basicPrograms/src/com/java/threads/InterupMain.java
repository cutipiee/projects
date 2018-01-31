package com.java.threads;

import java.util.concurrent.TimeUnit;

public class InterupMain {

	public static void main(String args[]) {
		FileSearch search=new FileSearch("C:\\Users\\Manpreet\\Desktop", "ThreadsIntrup.txt");
		
		Thread thread=new Thread(search);
		
		thread.start();
		
	
	try {
		TimeUnit.SECONDS.sleep(10);	
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	thread.interrupt();
	}
}
