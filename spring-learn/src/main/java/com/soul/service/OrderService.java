package com.soul.service;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

	/*public OrderService(){
		System.out.println("OrderService init");
	}*/
	public OrderService(UserService userService,TestService testService){
		System.out.println("OrderService TestService");
	}
	public OrderService(UserService userService){
		System.out.println("OrderService UserService");
	}


}
