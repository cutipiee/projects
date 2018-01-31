package com.java.threads;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class Main {
	public static void main(String args[]) {
		Thread t[]=new Thread[10];
		Thread.State status[]=new Thread.State[10];
		
		for(int i=0;i<10;i++){
			
			t[i]=new Thread(new Calculator(i));
			if((i%2)==0) {
			 t[i].setPriority(Thread.MAX_PRIORITY);
			}else {
			t[i].setPriority(Thread.MIN_PRIORITY);
		}
		t[i].setName("Thread"+i);
		}
		try (FileWriter fw=new FileWriter("C:\\Users\\Manpreet\\Desktop\\log.txt");
				PrintWriter pw=new PrintWriter(fw);){
			for(int i=0;i<10;i++) {
				pw.println("Main: Status of Thread"+i+":"+t[i].getState());
			}
		for(int i=0;i<10;i++) {
			t[i].start();
		} 
		boolean finish=false;
		while(!finish) {
			
			for(int i=0;i<10;i++) {
				if(t[i].getState()!=status[i]) {
					status[i]=t[i].getState();
					writeThreadInfo(pw, t[i],status[i]);
				}
			}
		finish=true;
		for(int i=0;i<10;i++) {
		 finish=finish &&(t[i].getState()==State.TERMINATED);
		}
		
		
		}
		
				
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}

	private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
		 pw.printf("Main : Id %d - %s\n",thread.getId(),thread.getName());
		 pw.printf("Main : Priority: %d\n",thread.getPriority());
		 pw.printf("Main : Old State: %s\n",state);
		 pw.printf("Main : New State: %s\n",thread.getState());
		 pw.printf("Main : ************************************\n");
		  }
	
	

}
