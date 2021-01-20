package com.myFirst.first;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpSession hsession) {
		
		ModelAndView mav = new ModelAndView();
		
		String userId = (String) hsession.getAttribute("user_id");
		if(userId == null) {
			mav.setViewName("login");			
		}
		else {
			mav.setViewName("home");
			mav.addObject("user_id", userId);
		}
		return mav;
	}
	
	@ RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(value = "user_id", defaultValue = "")String userId,
			@RequestParam(value = "user_password", defaultValue = "")String userPassword,
			HttpSession hsession){
		
		ModelAndView mav = new ModelAndView();
		
		if(userId.equals("admin") == true && userPassword.equals("1234") == true) {
			hsession.setAttribute("user_id", userId);
			mav.addObject("user_id");
			mav.setViewName("home");
		}
		else {
			hsession.removeAttribute("user_id");
			mav.setViewName("login_alert");
		}
		 
		return mav;
		
	}

	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession hsession) {
		
		ModelAndView mav = new ModelAndView();
		
		String userId = (String) hsession.getAttribute("user_id");
		if(userId == null) {
			mav.setViewName("login");			
		}
		else {
			mav.setViewName("logout");
			mav.addObject("user_id", userId);
			
			hsession.removeAttribute("user_id");
		}
		
		return mav;
	}
	
}
