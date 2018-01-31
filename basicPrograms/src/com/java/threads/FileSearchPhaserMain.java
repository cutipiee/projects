package com.java.threads;

import java.util.concurrent.Phaser;

public class FileSearchPhaserMain {
	public static void main(String rags[]) {
		Phaser phaser=new Phaser(3);
		 FileSearchPhaser system=new  FileSearchPhaser("C:\\Users\\Manpreet\\Desktop", "log", phaser);
		 FileSearchPhaser apps=new FileSearchPhaser("C:\\Program Files", "log", phaser);
		 FileSearchPhaser document=new FileSearchPhaser("C:\\Users\\Manpreet\\Desktop", "log", phaser);
		 Thread systemThread=new Thread(system,"system");
		 systemThread.start();
		 Thread appsThread=new Thread(apps,"apps");
		 appsThread.start();
		 Thread documentThread=new Thread(document,"Document");
		 documentThread.start();
		 try {
			 systemThread.join();
			 appsThread.join();
			 documentThread.join();
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 System.out.println("Terminated"+phaser.isTerminated());
	}

}
