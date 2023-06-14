package com.sundar.lc.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sundar.lc.api.UserRegisterDTO;

@Component("emailValidator")
public class EmailValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegisterDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");
		
		String email=((UserRegisterDTO)target).getCommunicationDTO().getEmail();
		
		if ( ! email.contains("@gmail.com")) {
			errors.rejectValue("communicationDTO.email", "email.invalid");
		}
	}

}
