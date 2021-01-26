package com.myFirst.dao.users;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.myFirst.dto.UserDTO;



public interface UserDAO {
	
	public String login(Map<String,Object> map);				// 로그인(올바른 아이디/비밀번호인지 체크)
	public UserDTO getUser(String id);							// user 데이터 읽어와 반환
	public List<UserDTO> getUserList();							// 사용자 List 얻기
	public void removeUser(String id);							// 사용자 삭제
	public void addUser(Map<String,Object> map);				// 사용자 추가
	public void updateUserByAdmin(Map<String,Object> map);		// 관리자에 의한 사용자 변경(등급 변경)
	public void updateUser(Map<String,Object> map);				// 사용자 변경(등급, 비번 제외)
	public void updateUserPassword(Map<String,Object> map);		// 사용자 비밀번호 변경
}
