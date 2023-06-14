package com.sundar.lc.controllers;

import java.util.Currency;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.WebBindingInitializer;

import com.sundar.lc.api.Amount;
import com.sundar.lc.api.BillDTO;
import com.sundar.lc.api.CommunicationDTO;
import com.sundar.lc.api.CreditCard;
import com.sundar.lc.api.Phone;
import com.sundar.lc.api.UserRegisterDTO;
import com.sundar.lc.formatter.CreditCardFormatter;
import com.sundar.lc.propertyEditor.CreditCardPropertyEditor;
import com.sundar.lc.propertyEditor.CurrencyPropertyEditor;
import com.sundar.lc.propertyEditor.NamePropertyEditor;
import com.sundar.lc.validators.EmailValidator;
import com.sundar.lc.validators.UserNameValidator;

@Controller
public class RegistrationController {

	@Autowired
	@Qualifier("emailValidator")
	private EmailValidator emailValidator;
	
	@RequestMapping("/register")
	public String register(Model model) {
		UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
		model.addAttribute("userRegisterDTO", userRegisterDTO);

		System.out.println("show-regsitration-page method.");

		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setPhoneNum("8929678300");

		CreditCard card = new CreditCard();
		card.setFirstFourDigit(1234);
		card.setSecondFourDigit(5678);
		card.setThreeFourDigit(8765);
		card.setFourFourDigit(4321);

		Amount amount = new Amount();
		amount.setBillAmount(100000);
		Currency currency = Currency.getInstance("USD");
		amount.setLocalDefinition(currency.getSymbol());

		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);

		BillDTO billDTO = new BillDTO();
		billDTO.setCreditCard(card);
		billDTO.setAmount(amount);

		userRegisterDTO.setCommunicationDTO(communicationDTO);
		userRegisterDTO.setBillDTO(billDTO);

		return "Register";
	}

	@RequestMapping("/processRegisterPage")
	public String processRegisterPage(@Valid @ModelAttribute("userRegisterDTO") UserRegisterDTO userRegisterDTO,
			BindingResult result) {

		System.out.println("show-RegisterSuccess-Page method.");

		//for calling validator manually.
		//we can also do component and autowiring for creating EmailValidator.
		emailValidator.validate(userRegisterDTO, result);
		
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "Register";
		}
		return "RegisterSuccess";
	}

	@InitBinder
	public void initbinder(WebDataBinder binder) {

		System.out.println("init binder.its execute before handler method.");

		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);

//      this will edit all the properties inside the class.
//    	NamePropertyEditor editor2=new NamePropertyEditor();
//    	binder.registerCustomEditor(String.class, editor2);

		NamePropertyEditor editor2 = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", editor2);

//      for call custom validators		
		binder.addValidators(new UserNameValidator());
//		binder.addValidators(new EmailValidator());
		
//      this will call the custom editor 
//    	CreditCardPropertyEditor editor3=new CreditCardPropertyEditor();
//      binder.registerCustomEditor(CreditCard.class,"billDTO.creditCard",editor3);

//      using this we can call formatter from here also.
//		binder.addCustomFormatter(new CreditCardFormatter());

		// binder.setDisallowedFields("name");

	}
}
