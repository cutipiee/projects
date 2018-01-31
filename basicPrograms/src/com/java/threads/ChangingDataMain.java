package com.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ChangingDataMain {

	public static void main(String args[]) {
		List<String> buffer1=new  ArrayList<>();
		List<String> buffer2=new ArrayList<>();
		Exchanger<List<String>> exchanger=new Exchanger<>();
		ChangingDataPro producer=new ChangingDataPro(buffer1, exchanger);
		ChnagingDataCons consumer=new ChnagingDataCons(buffer2, exchanger);
		Thread threadProducer=new Thread(producer);
		Thread threadConsumer=new Thread(consumer);
		threadProducer.start();
		threadConsumer.start();
	}
}
