package com.soul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	public UserService(){
		System.out.println("userService start");
	}

//	@Autowired
	public UserService(String userName){
		System.out.println("userService userName");
	}
}
