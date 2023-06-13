package com.sundar.lc.api;

import com.sundar.lc.validators.Age;

public class Phone {

	@Age(lower=90,upper =100)
	private String countryCode;
	
	private String phoneNum;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return countryCode + "-" + phoneNum;
	}
}
