package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class InMemoryCalculatorService implements ICalculatorService {

	@Override
	public Double add(Double first, Double second, Double third) {
		return first + second+third;
	}

	@Override
	public Double subtract(Double first, Double second, Double third) {
		return first - second - third;
	}

	@Override
	public Double multiply(Double first, Double second, Double third) {
		return first * second * third;
	}

	@Override
	public Double divide(Double first, Double second, Double third) {
		return first / second /third;
	}

}
