package com.java.threads;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class FileSearchPhaser implements Runnable {

	private String initPath;
	private String end;
	private List<String> result;
	private Phaser phaser;

	public FileSearchPhaser(String initPath, String end, Phaser phaser) {
		this.initPath = initPath;
		this.end = end;
		this.phaser = phaser;
		result = new ArrayList<>();
	}

	void directoryProcess(File file) {
		File list[] = file.listFiles();
		if (list != null) {
			for (int i = 0; i < list.length; i++) {
				if (list[i].isDirectory()) {
					directoryProcess(list[i]);
				} else {
					fileProcess(list[i]);
				}
			}
		}
	}

	void fileProcess(File file) {
		if (file.getName().endsWith(end)) {
			result.add(file.getAbsolutePath());
		}

	}

	void filterResult() {
		List<String> newResult = new ArrayList<>();
		long actualDate = new Date().getTime();
		for (int i = 0; i < result.size(); i++) {
			File file = new File(result.get(i));
			long fileDate = file.lastModified();

			if (actualDate - fileDate < TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)) {
				newResult.add(result.get(i));
			}
		}
		result=newResult;
	}
	 boolean checkResult() {
		if(result.isEmpty()) {
			System.out.printf("%s: Phase %d: 0 result.\n",Thread.currentThread().getName(),phaser.getPhase());
			phaser.arriveAndDeregister();
			return false;
		}else {
			System.out.printf("%s: Phase %d: %d results\n",Thread.currentThread().getName(),phaser.getPhase(),result.size());
			phaser.arriveAndAwaitAdvance();
			return true;
		}
		
		
	}

	@Override
	public void run() {
     phaser.arriveAndAwaitAdvance();
     System.out.printf("%s: Starting .\n",Thread.currentThread().getName());
     File file=new File(initPath);
     if(file.isDirectory()) {
    	 directoryProcess(file);
     }
     if(!checkResult()) {
    	 return;
     }
     filterResult();
     if(!checkResult()) {
    	 return;
     }
   
     phaser.arriveAndAwaitAdvance();
     System.out.printf("%s: Work completed.\n",Thread.currentThread().getName());
     
	}
	

}
