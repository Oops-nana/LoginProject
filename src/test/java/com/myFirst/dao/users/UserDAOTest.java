package com.myFirst.dao.users;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class UserDAOTest {

	private static final Logger log = LoggerFactory.getLogger(UserDAO.class);
	
	@Autowired
	private UserDAO userDao;
	
	@Test
	public void getUser() {
		UserDAO user = (UserDAO) userDao.getUser("admin");
		log.debug("User : {}", user);
		
	}

}
