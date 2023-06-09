package com.sundar.lc.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;
import com.sundar.lc.api.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard>{

	@Override
	public String print(CreditCard card, Locale locale) {
		System.out.println("inside the creditcard  print method. ");
		return card.getFirstFourDigit()+"-"+card.getSecondFourDigit()+"-"+card.getThreeFourDigit()+"-"+card.getFourFourDigit();
	}

	@Override
	public CreditCard parse(String text, Locale locale) throws ParseException {
		System.out.println("inside the creditcard  parse method. ");
		String[] creditCardArray= text.split("-");
		
		CreditCard card=new CreditCard();
		card.setFirstFourDigit(Integer.parseInt(creditCardArray[0]));
		card.setSecondFourDigit(Integer.parseInt(creditCardArray[1]));
		card.setThreeFourDigit(Integer.parseInt(creditCardArray[2]));
		card.setFourFourDigit(Integer.parseInt(creditCardArray[3]));
		
		return card;
	}

}
