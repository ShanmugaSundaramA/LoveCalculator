package com.sundar.lc.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sundar.lc.api.UserInfoDTO;

@Controller
@SessionAttributes({"userInfoDTO"})  //When we use @sessionAttributes obj name must be same as Model attribute obj name.
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
	public String homepage(UserInfoDTO userInfoDTO,Model model){//HttpServletRequest request) {
	
		
		/*Must same with @session attribute.*/
		model.addAttribute("userInfoDTO", userInfoDTO);
		
//		This is how get cookies from Client cookies.
		
//		Cookie[] cookies=request.getCookies();
//		for (Cookie cookie : cookies) {
//			if ("lcApp.userName".equals(cookie.getName())) {
//				userInfoDTO.setYourName(cookie.getValue());
//			}
//		}
		
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
     public String resultPage(@Valid @ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO,BindingResult result) {//,HttpSession session){//,HttpServletResponse response) {
    	 
    	 if(result.hasErrors()) {
    		 return "HomePage";
    	 }
    	 
			/*  This is how set value in cookies.
			 * 
			 * Cookie cookie=new Cookie("lcApp.userName", userInfoDTO.getYourName());
			 * cookie.setMaxAge(86400); response.addCookie(cookie);
			 */  
    	 
    	 //This is how set the session and use Session.
    	 
    	 // session.setAttribute("userName", userInfoDTO.getYourName());
    	 
    	 return "ResultPage";
     }
}
