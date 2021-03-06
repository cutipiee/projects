package com.java.thread.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class DocumentTaskMain {

	public static void main(String args[]) {
		Document mock=new Document();
		String[][]document=mock.generateDocument(100, 100, "the");
		DocumentTask task=new DocumentTask(document, 0, 100, "the");
		ForkJoinPool pool=new ForkJoinPool();
		pool.execute(task);
		do {
			System.out.println("*************************************");
			System.out.printf("Main : Parallesim: %d\n",pool.getParallelism());
			System.out.printf("Main : Active Thread: %d\n",pool.getActiveThreadCount());
			System.out.printf("Main : Task count: %d\n",pool.getQueuedTaskCount());
			System.out.printf("Main : Steel count: %d\n",pool.getStealCount());
			System.out.println("**************************************");
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(!task.isDone());
		pool.shutdown();
		try {
			pool.awaitTermination(1,TimeUnit.DAYS);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		try {
			System.out.printf("Main: The word appear %d in the document",task.get());
		}catch(InterruptedException |ExecutionException e) {
			e.printStackTrace();
		}
	}
}
