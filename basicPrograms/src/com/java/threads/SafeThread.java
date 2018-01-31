package com.java.threads;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SafeThread implements Runnable{

	private static ThreadLocal<Date> startDate=new ThreadLocal<Date>() {
		
		@SuppressWarnings("unused")
		protected Date intialValue() {
			return new Date();
			
		}
	};
	
	@Override
	public void run() {
		System.out.printf("Startin thread: %s : %s\n",Thread.currentThread().getId(),startDate.get());
		try {
			TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
			
		}catch	(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread finish: %s: %s\n",Thread.currentThread().getId(),startDate.get());
	}
	

}
