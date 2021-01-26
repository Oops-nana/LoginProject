package com.myFirst.first;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myFirst.dao.users.UserDAO;


public class HomeControllerTest {
	
	@RequestMapping(value="testScan")
	public String testScan(HttpServletRequest req) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		UserDAO dao = (UserDAO) context.getBean("hello");
		req.setAttribute("value", dao.getUser("wonjae"));
		
		return "test";
	}
}
