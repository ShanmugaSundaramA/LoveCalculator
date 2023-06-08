package com.sundar.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sundar.lc.api.UserInfoDTO;

@Controller
public class HomePageController {

	/* 2
	 * @RequestMapping("/") 
	 * public String homepage() { 
	 *    return "HomePage"; 
	 * }
	 */
	
	/* 3
	@RequestMapping("/")
	public String homepage(Model model) {
		UserInfoDTO userInfoDTO=new UserInfoDTO();
		model.addAttribute("userInfoDTO", userInfoDTO);
		return "HomePage";
	}
	*/
	
	@RequestMapping("/")
	public String homepage(@ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO) {
		return "HomePage";
	}
	
	/* 1
	 * @RequestMapping("/homePageProcess")
	 * public String resultPage(@RequestParam("yourName") String userName,@RequestParam String crushName,Model model) {
	 *     System.out.println(userName+" "+crushName);
	 *     model.addAttribute("userName", userName); model.addAttribute("crushName", crushName);
	 *     return "ResultPage"; 
	 * }
	 */
	
   /* 3
	@RequestMapping("/homePageProcess")
     public String resultPage(UserInfoDTO userInfoDTO,Model model) {
    	 model.addAttribute("userInfoDTO",userInfoDTO);
    	 return "ResultPage";
     }
     */
     
     @RequestMapping("/homePageProcess")
     public String resultPage(@Valid @ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO,BindingResult result) {
    	 
    	 if(result.hasErrors()) {
    		 return "HomePage";
    	 }
    	 
    	 return "ResultPage";
     }
}
