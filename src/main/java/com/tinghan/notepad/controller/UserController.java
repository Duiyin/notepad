package com.tinghan.notepad.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.tinghan.notepad.domain.RegisterDto;
import com.tinghan.notepad.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(value = "/register")
	public String register(@Valid RegisterDto registerDto){
		userService.createById(registerDto);
		return "success";
	}
}
