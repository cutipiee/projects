package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.model.AirthmeticModel;

@Component
public class Utility {

	public AirthmeticModel createResponse(Double first, Double second,Double third, Double result, String status) {
		return new AirthmeticModel(first, second,third, result, status);
	}

}
