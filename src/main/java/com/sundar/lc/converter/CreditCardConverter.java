package com.sundar.lc.converter;

import org.springframework.core.convert.converter.Converter;

import com.sundar.lc.api.CreditCard;

public class CreditCardConverter implements Converter<String, CreditCard> {

	@Override
	public CreditCard convert(String source) {
		String[] creditCardArray = source.split("-");

		System.out.println("Inside the CreditCard convert");
		
		CreditCard card = new CreditCard();
		
		card.setFirstFourDigit(Integer.parseInt(creditCardArray[0]));
		card.setSecondFourDigit(Integer.parseInt(creditCardArray[1]));
		card.setThreeFourDigit(Integer.parseInt(creditCardArray[2]));
		card.setFourFourDigit(Integer.parseInt(creditCardArray[3]));
		
		return card;
	}



}
