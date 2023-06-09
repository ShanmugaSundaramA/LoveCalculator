package com.sundar.lc.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;
import com.sundar.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("inside the print method.");
		return phone.getCountryCode() + "-" + phone.getPhoneNum();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		System.out.println("inside the parse method");
		String[] phoneNumberArray = text.split("-");
		Phone phone = new Phone();

		if (text.indexOf("-") == -1 || text.startsWith("-")) {
			phone.setCountryCode("91");
			phone.setPhoneNum(phoneNumberArray[0]);
		} else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setPhoneNum(phoneNumberArray[1]);
		}
		return phone;
	}

}
