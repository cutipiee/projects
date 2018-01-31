package com.example.demo.model;

public class AirthmeticModel {

	private Double firstValue;
	private Double secondValue;
	private Double thirdValue;
	private Double result;
	private String status;

	public AirthmeticModel(Double firstValue, Double secondValue, Double thirdValue, Double result, String status) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
		this.result = result;
		this.status = status;
	}

	public Double getThirdValue() {
		return thirdValue;
	}

	public void setThirdValue(Double thirdValue) {
		this.thirdValue = thirdValue;
	}

	public Double getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(Double firstValue) {
		this.firstValue = firstValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AirthmeticModel() {
	}

	

	public Double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(Double secondValue) {
		this.secondValue = secondValue;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

}
