package com.myFirst.support;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myFirst.dao.users.UserDAO;
import com.myFirst.dto.UserDTO;

@Configuration
public class BeanConfiguration {

	@Bean 
	public UserDAO userDAO() {
		
		return new UserDAO() {			
			@Override
			public void updateUserPassword(Map<String, Object> map) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateUserByAdmin(Map<String, Object> map) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateUser(Map<String, Object> map) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removeUser(String id) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String login(Map<String, Object> map) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<UserDTO> getUserList() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public UserDTO getUser(String id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void addUser(Map<String, Object> map) {
				// TODO Auto-generated method stub
				
			}
	
	};
	
}
}
