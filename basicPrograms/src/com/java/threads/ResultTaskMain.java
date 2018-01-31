package com.java.threads;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultTaskMain {

	public static void main(String args[]) {
		ExecutorService service=(ExecutorService)Executors.newCachedThreadPool();
		List<ResultTask> taskList=new ArrayList<ResultTask>();
		for(int i=0;i<3;i++) {
			ResultTask task=new ResultTask("ab");
			taskList.add(task);
		}
			List<Future<Result>> resultList=null;
			try {
				resultList=service.invokeAll(taskList);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			service.shutdown();
			System.out.println("Main printing the results");
			for(int i=0;i<resultList.size();i++) {
				Future<Result>future =resultList.get(i);
				try {
					Result result=future.get();
					System.out.println(result.getName()+": "+result.getValue());
					
				}catch(InterruptedException  |ExecutionException e) {
					e.printStackTrace();
				
			}
		}
	}
}
