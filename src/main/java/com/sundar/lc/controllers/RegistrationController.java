package com.sundar.lc.controllers;

import java.util.Currency;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundar.lc.api.Amount;
import com.sundar.lc.api.BillDTO;
import com.sundar.lc.api.CommunicationDTO;
import com.sundar.lc.api.CreditCard;
import com.sundar.lc.api.Phone;
import com.sundar.lc.api.UserRegisterDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String register(Model model) {
		UserRegisterDTO userRegisterDTO=new UserRegisterDTO();
		model.addAttribute("userRegisterDTO",userRegisterDTO);
		
		System.out.println("show-regsitration-page method.");
		
		Phone phone =new Phone();
		phone.setCountryCode("91");
		phone.setPhoneNum("8929678300");
		
		CreditCard card=new CreditCard();
		card.setFirstFourDigit(1234);
		card.setSecondFourDigit(5678);
		card.setThreeFourDigit(8765);
		card.setFourFourDigit(4321);
		
		Amount amount=new Amount();
		amount.setBillAmount(100000);
		Currency currency=Currency.getInstance("USD");		
		amount.setLocalDefinition(currency.getSymbol());
		
		CommunicationDTO communicationDTO=new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		BillDTO billDTO=new BillDTO();
		billDTO.setCreditCard(card);
		billDTO.setAmount(amount);
		
		userRegisterDTO.setCommunicationDTO(communicationDTO);
		userRegisterDTO.setBillDTO(billDTO);
		
		return "Register";
	}
	
	@RequestMapping("/processRegisterPage")
	public String processRegisterPage(@Valid @ModelAttribute("userRegisterDTO") UserRegisterDTO userRegisterDTO,BindingResult result) {
		
		System.out.println("show-RegisterSuccess-Page method.");
		
	    if(result.hasErrors()) {
	    	return "RegisterSuccess";
	    }
		return "RegisterSuccess";
	}
	
}
