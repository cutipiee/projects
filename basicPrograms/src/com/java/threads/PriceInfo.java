package com.java.threads;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PriceInfo {

	private Double price1;
	private Double price2;
	private ReadWriteLock lock;
	
	public PriceInfo() {
		price1=2d;
		price2=3d;
		lock=new ReentrantReadWriteLock();
	}
	public double getPrice1() {
		lock.readLock().lock();
		double value=price1;
		return value;
		
		
	}
	public double getPrice2() {
		lock.readLock().lock();
		double value=price2;
		return value;
	}
	public void setPrice(double price1,double price2) {
		lock.writeLock().lock();
		this.price1=price1;
		this.price2=price2;
		lock.writeLock().unlock();
	}
}
