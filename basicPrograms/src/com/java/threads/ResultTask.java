package com.java.threads;


import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ResultTask implements Callable<Result>{

	private String name;
	
	public ResultTask(String name) {
		this.name=name;
	}
	
	
	@Override
	public Result call() throws Exception {
		try {
		long duration=(long)(Math.random()*10);
		System.out.printf("%s: Waiting %d seconds for results.\n",this.name,duration);
		TimeUnit.SECONDS.sleep(duration);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		int value=0;
		for(int i=0;i<5;i++) {
			value+=Math.random()*100;
			
		}
		Result result=new Result();
		result.setName(this.name);
		result.setValue(value);
		System.out.println("Value"+value);
		return result;
	}

	
}
