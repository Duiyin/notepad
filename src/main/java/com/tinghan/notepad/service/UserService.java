package com.tinghan.notepad.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinghan.notepad.dao.UserDao;
import com.tinghan.notepad.domain.User;
import com.tinghan.notepad.domain.UserDto;

@Component
@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void register(UserDto userDto){
		User user = new User();
		BeanUtils.copyProperties(userDto, user, User.class);
		userDao.save(user);
	}
}
