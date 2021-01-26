package com.myFirst.first;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myFirst.dao.users.UserDAO;
import com.myFirst.dto.UserDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
@Component
public class HomeController {
	
	private UserDAO userDAO;
	
	public HomeController() {
		// TODO Auto-generated constructor stub
	}	
	
	public HomeController(UserDAO userDao) {
		this.userDAO = userDao;
	}
		
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
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView loginProc(
			@RequestParam(value = "user_id", defaultValue = "")String userId,
			@RequestParam(value = "user_password", defaultValue = "")String userPassword,
			HttpSession hsession){
		
		ModelAndView mav = new ModelAndView();
		
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("userPassword", userPassword);
		
		String result = null;
		int check = 0;
		try {
			result = userDAO.login(map);
		} catch (Exception e) {
			hsession.removeAttribute("session_id");
			hsession.removeAttribute("session_name");
			hsession.removeAttribute("session_grade");
			hsession.removeAttribute("session_screen");			
			check = 0;
		}
		 
		if(result!=null) {
			if(result.equals("OK") == true) {
				UserDTO user = userDAO.getUser(userId);
				hsession.setAttribute("session_id", user.getUserId());
				check = 1;
			}
		}
		else {
			hsession.removeAttribute("session_id");
		}
		mav.addObject("check",check);
		mav.setViewName("loginProc");
		
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
