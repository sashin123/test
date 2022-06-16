package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class testController {
	
	@GetMapping("/home")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/about")
	public String about() {
		return "{my name is bangledore maybe im from scarnish but maybe not maybe im from burgush, or sumn maybe naybe haybe saybe}";
	}
	
	@GetMapping("/tinder")
	public String tinder() {
		return "meet the love of your life buddy muffin";
	}

}
