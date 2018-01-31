package com.java.threads;

public class Writer implements Runnable {

	PriceInfo priceInfo;

	public Writer(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	@Override
	public void run() {

		for(int i=0;i<3;i++) {
			System.out.printf("Writer: Attempt to modifiy the price.\n");
			priceInfo.setPrice(Math.random()*10, Math.random()*8);
			System.out.println("Price has been modified");
			try {
				Thread.sleep(2);
				
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
