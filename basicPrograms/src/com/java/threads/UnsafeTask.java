package com.java.threads;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnsafeTask implements Runnable{
 private Date startDate;
 
	
	
	@Override
	public void run() {
		startDate=new Date();
		System.out.printf("Strating thread:%s,%s\n",Thread.currentThread().getId(),startDate);
		try {
			TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
			
		}catch	(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread finish: %s: %s\n",Thread.currentThread().getId(),startDate);
	}
	

}
