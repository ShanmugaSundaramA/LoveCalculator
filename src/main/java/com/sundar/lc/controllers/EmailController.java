package com.sundar.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundar.lc.api.EmailDTO;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail/{userName}")
	public String sendEmail(@PathVariable("userName")String userName, Model model) {
        model.addAttribute("userName",userName);
        model.addAttribute("emailDTO", new EmailDTO());
		return "sendEmailPage";
	}
	
	@RequestMapping("/processEmail")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		return "processEmailPage";
	}
}
