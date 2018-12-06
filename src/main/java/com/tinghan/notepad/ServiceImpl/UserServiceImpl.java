package com.tinghan.notepad.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinghan.notepad.dao.UserMapper;
import com.tinghan.notepad.domain.RegisterDto;
import com.tinghan.notepad.domain.User;
import com.tinghan.notepad.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User createById(RegisterDto registerDto) {
		
		User user = new User();
		//先查是否重号，不重号则创建
		
		user.setAccount(registerDto.getAccount());
		user.setPassword(registerDto.getPassword());
		// TODO Auto-generated method stub
		userMapper.createById(user);
		return null;
	}

}
