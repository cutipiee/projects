package com.java.threads;

public class Cinema {
	private long vacCinema1;
	private long vacCinema2;
	private final Object cinemaCntr1, cinemaCntr2;

	public Cinema() {
		cinemaCntr1 = new Object();
		cinemaCntr2 = new Object();
		vacCinema1 = 20;
		vacCinema2 = 20;
	}

	public boolean sellTicket1(int number) {
		synchronized (cinemaCntr1) {
			if (number < vacCinema1) {
				vacCinema1 -= number;
				return true;

			} else {
				return false;
			}
		}
	}

	public boolean sellTicket2(int number) {
		synchronized (cinemaCntr2) {
			if (number < vacCinema2) {
				vacCinema2 -= number;
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean returnTicket1(int number) {
		synchronized (cinemaCntr1) {
			vacCinema1 += number;
			return true;

		}
	}

	public boolean returnTicket2(int number) {
		synchronized (cinemaCntr2) {
			vacCinema2 += number;
			return true;

		}
	}

	public long getVacancyCinema1() {
		return vacCinema1;
	}

	public long getVacancyCinema2() {
		return vacCinema2;
	}
}
