package com.java.threads;

import java.util.List;
import java.util.concurrent.Exchanger;

public class ChangingDataPro implements Runnable{

	private List<String> buffer;
	private final Exchanger<List<String>> exchanger;
	
	public ChangingDataPro(List<String> buffer,Exchanger<List<String>> exchanger) {
		this.buffer=buffer;
		this.exchanger=exchanger;
	}
	
	@Override
	public void run() {
		int Cycle=1;
		for(int i=0;i<10;i++) {
			System.out.printf("Producer: Cycle %d\n",Cycle);
			for(int j=0;j<10;j++) {
				String message="Event"+((i*10)+j);
				System.out.printf("Producer: %s\n",message);
				buffer.add(message);
				try {
					buffer=exchanger.exchange(buffer);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Produce:"+buffer.size());
				Cycle++;
			}
		}
		
	}
	

}
