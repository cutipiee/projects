package com.java.threads;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

	private Date initDate;
	private String name;
	
	public Task(String name) {
		this.name=name;
		initDate=new Date();
	}
	
	@Override
	public void run() {
		
		System.out.printf("%s: Task %s: Created on : %s\n",Thread.currentThread().getName(),name,initDate);
		System.out.printf("%s: Task %s: Started on: %s\n",Thread.currentThread().getName(),name,new Date());
		try {
			long duration=(long)Math.random()*10;
			System.out.printf("%s: Task %s: Doing a task during %d seconds",Thread.currentThread().getName(),name,duration);;
			TimeUnit.SECONDS.sleep(duration);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s: Task %s: Finished on: %s",Thread.currentThread().getName(),name,new Date());
		
	}

}
