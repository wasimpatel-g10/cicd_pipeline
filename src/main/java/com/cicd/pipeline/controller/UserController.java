package com.cicd.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/welcome")
	public String myMessage() {
		return "hello world";
	}
	@GetMapping("/do")
	public String myData() {
		return "haa bhai !!!";
	}

}
