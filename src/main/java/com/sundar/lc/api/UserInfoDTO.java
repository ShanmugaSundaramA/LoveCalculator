package com.sundar.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "Please enter your Name.")
	@Size(min = 3, max = 20, message = "Name must be between 3 - 20")
	private String yourName;

	@NotBlank(message = "Please enter your Name.")
	@Size(min = 3, max = 20, message = "Name must be between 3 - 20")
	private String crushName ;
	
	@AssertTrue(message = "pls check the term and condtion to use this app")
	private boolean termAndConditon;
	
	public boolean isTermAndConditon() {
		return termAndConditon;
	}

	public void setTermAndConditon(boolean termAndConditon) {
		this.termAndConditon = termAndConditon;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}



}
