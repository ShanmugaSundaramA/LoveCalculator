package com.sundar.lc.api;

public class Amount {

	@Override
	public String toString() {
		return  billAmount + "-"+ localDefinition ;
	}

	private Integer billAmount;
	private String localDefinition;

	public Integer getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}

	public String getLocalDefinition() {
		return localDefinition;
	}

	public void setLocalDefinition(String localDefinition) {
		this.localDefinition = localDefinition;
	}

}
