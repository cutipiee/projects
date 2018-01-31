package com.java.threads;

import java.util.concurrent.Callable;

public class TaskValidator implements Callable<String>{

	private UserValidator validator;
	private String user,password;
	
	public TaskValidator(UserValidator validator,String user,String password) {
		
		this.validator=validator;
		this.user=user;
		this.password=password;
	}

	@Override
	public String call() throws Exception {
		
		if(!validator.validate(user, password)) {
			System.out.printf("%s: The user not found\n", validator.getName());
			throw new Exception("Error validating user");
		}
		System.out.printf("%s: The user has been found\n",validator.getName());
		return validator.getName();
	}

	
}
