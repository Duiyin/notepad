package com.tinghan.notepad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tinghan.notepad.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
}
