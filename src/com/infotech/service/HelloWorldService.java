package com.infotech.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public String welcomeMessage(){
		return "welcome to spring MVC World";
	}
	
	public String welcomeAgainMessage(){
		return "Welcome Again to spring MVC";
	}
}
