package com.tinghan.notepad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(){
		return "index";
	}
	
	@GetMapping("/personal")
	public String personal(){
		return "personal";
	}
}
