package com.sundar.lc.propertyEditor;

import java.beans.PropertyEditorSupport;

import com.sundar.lc.api.CreditCard;

public class CreditCardPropertyEditor extends PropertyEditorSupport {

	
	
	@Override
	public String getAsText() {
		System.out.println("9999999999999999999");
		CreditCard card= (CreditCard)getValue();
		return card.getFirstFourDigit()+"**"+card.getSecondFourDigit()+"-"+card.getThreeFourDigit()+"-"+card.getFourFourDigit();
	}


	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		System.out.println("888888888888");
		
		String[] creditCardArray = text.split("-");

		CreditCard card = new CreditCard();
		
		card.setFirstFourDigit(Integer.parseInt(creditCardArray[0]));
		card.setSecondFourDigit(Integer.parseInt(creditCardArray[1]));
		card.setThreeFourDigit(Integer.parseInt(creditCardArray[2]));
		card.setFourFourDigit(Integer.parseInt(creditCardArray[3]));

		setValue(card);

	}

}
