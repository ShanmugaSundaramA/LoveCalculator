package com.sundar.lc.converter;

import org.springframework.core.convert.converter.Converter;

import com.sundar.lc.api.CreditCard;

public class CreditCardConverterObjToString implements Converter<CreditCard, String> {

	@Override
	public String convert(CreditCard card) {
	   return card.getFirstFourDigit()+"-"+card.getSecondFourDigit()+"-"+card.getThreeFourDigit()+"-"+card.getFourFourDigit();
	}

}
