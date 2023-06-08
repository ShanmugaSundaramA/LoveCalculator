package com.sundar.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundar.lc.api.UserRegisterDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String register(Model model) {
		UserRegisterDTO userRegisterDTO=new UserRegisterDTO();
		model.addAttribute("userRegisterDTO",userRegisterDTO);
		return "Register";
	}
	
	@RequestMapping("/processRegisterPage")
	public String processRegisterPage(@Valid @ModelAttribute("userRegisterDTO") UserRegisterDTO userRegisterDTO,BindingResult result) {
		
	    if(result.hasErrors()) {
	    	return "Register";
	    }
		return "RegisterSuccess";
	}
	
}
