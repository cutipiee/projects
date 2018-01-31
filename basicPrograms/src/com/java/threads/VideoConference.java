package com.java.threads;

import java.util.concurrent.CountDownLatch;

public class VideoConference implements Runnable{

	private final CountDownLatch controller;
	public VideoConference(int number) {
		controller=new CountDownLatch(number);
	}
	public void arrive(String name) {
		System.out.printf("%s: has arrive",name);
		controller.countDown();
		System.out.printf("VideoConference: Waiting for %d participant.\n",controller.getCount());
	}
	
	@Override
	public void run() {
	System.out.printf("VideoConference : Intialization :%d participant\n",controller.getCount());
		
	try {
		controller.await();
		System.out.printf("Video conference : Let's start..\n");
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}

	
}
