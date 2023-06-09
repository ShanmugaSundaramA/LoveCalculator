package com.sundar.lc.api;

public class CreditCard {

	@Override
	public String toString() {
		return firstFourDigit + "-" + secondFourDigit+ "-" + threeFourDigit + "-" + fourFourDigit;
	}

	private Integer firstFourDigit;
	private Integer secondFourDigit;
	private Integer threeFourDigit;
	private Integer fourFourDigit;

	public Integer getFirstFourDigit() {
		return firstFourDigit;
	}

	public void setFirstFourDigit(Integer firstFourDigit) {
		this.firstFourDigit = firstFourDigit;
	}

	public Integer getSecondFourDigit() {
		return secondFourDigit;
	}

	public void setSecondFourDigit(Integer secondFourDigit) {
		this.secondFourDigit = secondFourDigit;
	}

	public Integer getThreeFourDigit() {
		return threeFourDigit;
	}

	public void setThreeFourDigit(Integer threeFourDigit) {
		this.threeFourDigit = threeFourDigit;
	}

	public Integer getFourFourDigit() {
		return fourFourDigit;
	}

	public void setFourFourDigit(Integer fourFourDigit) {
		this.fourFourDigit = fourFourDigit;
	}
	
	

}
