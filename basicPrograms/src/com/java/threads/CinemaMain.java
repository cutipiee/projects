package com.java.threads;


public class CinemaMain {
	public static void main(String args[]) {
		Cinema cinema=new Cinema();
		TicketOfc1 ofc1=new TicketOfc1(cinema);
		Thread t1=new Thread(ofc1,"Ticketoffice1");
		TicketOfc2 ofc2=new TicketOfc2(cinema);
		Thread t2=new Thread(ofc2,"TicketOffice2");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Room 1 Vacancies: %d\n",cinema.getVacancyCinema1());
		System.out.printf("Room 2 Vacancies: %d\n",cinema.getVacancyCinema2());
	}

}
