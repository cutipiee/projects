package com.java.threads;

public class PriceInfoMain {
	public static void main(String args[]) {
		
		PriceInfo priceInfo=new PriceInfo();
		Reader reader[]=new Reader[5];
		Thread threadReadder[]=new Thread[5];
		
		for(int i=0;i<5;i++) {
			reader[i]=new Reader(priceInfo);
			threadReadder[i]=new Thread(reader[i]);
		}
		Writer writer=new Writer(priceInfo);
		Thread threadwriter=new Thread(writer);
		for(int i=0;i<5;i++) {
			threadReadder[i].start();
			
		}
		threadwriter.start();
	}

}
