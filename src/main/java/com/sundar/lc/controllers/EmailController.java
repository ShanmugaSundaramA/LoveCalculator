package com.sundar.lc.controllers;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundar.lc.api.EmailDTO;

@Controller
public class EmailController {

//  it is how use @PathVariable.

//	@RequestMapping("/sendEmail/{userName}")
//	public String sendEmail(@PathVariable("userName")String userName, Model model) {
//        model.addAttribute("userName",userName);
//        model.addAttribute("emailDTO", new EmailDTO());
//		return "sendEmailPage";
//	}
	
//  This is how use @CookieValue
	
//	@RequestMapping("/sendEmail")
//	public String sendEmail(@CookieValue("lcApp.userName") String userName, Model model) {
//		model.addAttribute("userName", userName);
//		model.addAttribute("emailDTO", new EmailDTO());
//		return "sendEmailPage";
//	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail( Model model) {
		model.addAttribute("emailDTO", new EmailDTO());
		return "sendEmailPage";
	}

	@RequestMapping("/processEmail")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO, HttpSession session,Model model) {
		
	    String username=(String)session.getAttribute("userName");
		String newUserName="Mr. "+username;
		
		model.addAttribute("userName", newUserName);
		
		return "processEmailPage";
	}
}
