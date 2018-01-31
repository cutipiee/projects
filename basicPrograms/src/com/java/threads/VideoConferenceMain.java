package com.java.threads;

public class VideoConferenceMain {

	public static void main(String args[]) {
		VideoConference conference = new VideoConference(10);
		Thread thread = new Thread(conference);
		thread.start();
		for (int i = 0; i < 10; i++) {
			Participant participant = new Participant(conference, "Participant" + i);
			Thread t = new Thread(participant);
			t.start();
		}
	}

}
