package com.soul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);


		ac.refresh();
	}
}
