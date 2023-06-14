package com.sundar.lc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sundar.lc.api.UserRegisterDTO;

public class UserNameValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegisterDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty","UserName cannot be empty.");
		
		String userName=((UserRegisterDTO)target).getUserName();
		
		if (! userName.contains("_")) {
			errors.rejectValue("userName", "userName.invalidString", "UserName does not contain '_'.");
		}
	}

}
