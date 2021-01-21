package com.myFirst.dao.users;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.myFirst.dto.userDTO;

@Repository
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO{

	@Override
	public String login(Map<String, Object> map) {
		return getSqlSession().selectOne("login",map);
	}
	//사용자  ID에 해당하는 정보를 읽어옴
	// 성공 userDTO 실패 null
	@Override
	public userDTO getUser(String id) {
		return getSqlSession().selectOne("getUser", id);
	}

	@Override
	public List<userDTO> getUserList() {
		return getSqlSession().selectList("getUserList");
	}

	@Override
	public void removeUser(String id) {
		getSqlSession().delete("removeUser", id);
		
	}

	@Override
	public void addUser(Map<String, Object> map) {
		getSqlSession().insert("addUser", map);
		
	}

	@Override
	public void updateUserByAdmin(Map<String, Object> map) {
		getSqlSession().update("updateUserByAdmin",map);
		
	}

	@Override
	public void updateUser(Map<String, Object> map) {
		getSqlSession().update("updateUser", map);
		
	}

	@Override
	public void updateUserPassword(Map<String, Object> map) {
		getSqlSession().update("updateUserPassword",map);
		
	}

}
