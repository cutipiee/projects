package com.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserValidatorMain {
	public static void main(String args[]) {
		
		String userName="test";
		String password="test";
		UserValidator ldpaValidator=new UserValidator("LDAP");
		UserValidator dbValidator=new UserValidator("Database");
		TaskValidator ldpaTask=new TaskValidator(ldpaValidator, userName, password);
		TaskValidator dbTask=new TaskValidator(dbValidator, userName, password);
		List<TaskValidator>taskList=new ArrayList<>();
		taskList.add(ldpaTask);
		taskList.add(dbTask);
		ExecutorService executor=(ExecutorService)Executors.newCachedThreadPool();
		String result;
		try {
			result=executor.invokeAny(taskList);
			System.out.printf("Main: Result: %s\n",result);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}catch (ExecutionException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		System.out.printf("Main: End of Execution\n");
	}

}
