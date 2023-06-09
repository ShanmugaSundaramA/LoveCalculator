package com.sundar.lc.formatter;

import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import org.springframework.format.Formatter;
import com.sundar.lc.api.Amount;

public class AmountFormatter implements Formatter<Amount>{

	@Override
	public String print(Amount amount, Locale locale) {
		System.out.println("inside the amount print method.");
		return amount.getBillAmount()+" "+amount.getLocalDefinition();
	}

	@Override
	public Amount parse(String text, Locale locale) throws ParseException {
		
		System.out.println("inside the amount parse method.");
		String[] amountArray= text.split(" ");
		Amount amount = new Amount();
		amount.setBillAmount(Integer.parseInt(amountArray[0]));

		amount.setLocalDefinition(Currency.getInstance(amountArray[1]).getSymbol(locale.US));
		return amount;
	}

}
