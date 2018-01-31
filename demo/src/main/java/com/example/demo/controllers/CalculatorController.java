package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AirthmeticModel;
import com.example.demo.service.ICalculatorService;
import com.example.demo.util.Utility;

@RestController
public class CalculatorController {

	@Autowired
	private ICalculatorService calculatorService;

	@Autowired
	private Utility util;

	@GetMapping("/")
	public String sayHello() {
		return "hello";
	}

	@GetMapping("add/{first}/{second}/{third}/")
	public ResponseEntity<AirthmeticModel> add(@PathVariable Double first, @PathVariable Double second, @PathVariable Double third ) {
		return ResponseEntity.ok(util.createResponse(first, second,third, calculatorService.add(first, second, third), "ok"));
	}

	@GetMapping("sub/{first}/{second}/{third}/")
	public ResponseEntity<AirthmeticModel> subtract(@PathVariable Double first, @PathVariable Double second, @PathVariable Double third) {
		return ResponseEntity.ok(util.createResponse(first, second,third, calculatorService.subtract(first, second, third), "ok"));
	}

	@GetMapping("mul/{first}/{second}/{third}/")
	public ResponseEntity<AirthmeticModel> multiply(@PathVariable Double first, @PathVariable Double second, @PathVariable Double third) {
		return ResponseEntity.ok(util.createResponse(first, second,third, calculatorService.multiply(first, second, third), "ok"));
	}

	@GetMapping("div/{first}/{second}/{third}/")
	public ResponseEntity<AirthmeticModel> divide(@PathVariable Double first, @PathVariable Double second, @PathVariable Double third) {
		return ResponseEntity.ok(util.createResponse(first, second,third, calculatorService.divide(first, second, third), "ok"));
	}

}
