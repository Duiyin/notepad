package com.tinghan.notepad.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.tinghan.notepad.domain.UserDto;
import com.tinghan.notepad.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public String login(@Valid UserDto userDto){
		 
		return "redirect:/";
	}
	
	@PostMapping("/register")
	public String register(@Valid UserDto userDto){
		userService.register(userDto);
		return "redirect:/";
	}
}
