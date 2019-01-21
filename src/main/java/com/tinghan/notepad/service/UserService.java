package com.tinghan.notepad.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tinghan.notepad.dao.UserDao;
import com.tinghan.notepad.domain.User;
import com.tinghan.notepad.domain.UserDto;
import com.tinghan.notepad.util.PasswordUtil;
import com.tinghan.notepad.util.Result;
import com.tinghan.notepad.util.ValidTool;

@Component
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;

	public User register(UserDto userDto) {
		try {
			User user = new User();
			User repeat = userDao.getOneById(userDto.getAccount());
			if (null != repeat) {
				return (User) Result.failed();
			} else {
				if (ValidTool.isEmail(userDto.getEmail())) {
					BeanUtils.copyProperties(userDto, user, User.class);
					user.setPassword(PasswordUtil.createPassword(userDto.getPassword()));
					userDao.save(user);
				}
				else{
					return user;
				}
			}
			return user;
		} catch (Exception e) {
			throw e;
		}
	}
}
