package com.java.threads;

public class TicketOfc1 implements Runnable {
 
	private Cinema cinema;
	
	 public TicketOfc1(Cinema cinema) {
		 this.cinema=cinema;
		
	}
	
	@Override
	public void run() {
		cinema.sellTicket1(2);
		cinema.sellTicket2(5);
	    cinema.sellTicket2(10);
		
		
	}

}
