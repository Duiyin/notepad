package com.tinghan.notepad.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tinghan.notepad.domain.User;

@Component
@Transactional
public class UserDao extends BaseDao<User>{
	
	// save user
	public void save(User user) {
		getSession().save(user);
	}
}
