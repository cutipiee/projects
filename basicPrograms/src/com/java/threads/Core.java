package com.java.threads;

import java.util.concurrent.TimeUnit;

public class Core {

	public static void main(String args[]) {
		SafeThread task=new SafeThread();
		for(int i=0;i<10;i++) {
			Thread thread=new Thread(task);
			thread.start();
		}
		try {
			TimeUnit.SECONDS.sleep(2);
			
		}catch(InterruptedException ex) {
			ex.printStackTrace();
			
		}
	}
}
