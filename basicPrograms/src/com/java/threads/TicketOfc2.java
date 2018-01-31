package com.java.threads;

public class TicketOfc2 implements Runnable{

	Cinema cinema;
	 public TicketOfc2(Cinema cinema) {
		 this.cinema=cinema;
		 
	 }
	
	@Override
	public void run() {
		cinema.sellTicket1(2);
		cinema.sellTicket2(10);
		
	}

}
