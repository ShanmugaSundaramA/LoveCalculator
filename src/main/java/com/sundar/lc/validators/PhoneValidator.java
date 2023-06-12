package com.sundar.lc.validators;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Pone, String> {

	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {

		if (Pattern.matches("\\d{10}", phoneNumber)) {
			return true;
		}

		return false;
	}

}
