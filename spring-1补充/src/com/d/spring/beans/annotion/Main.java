package com.d.spring.beans.annotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.d.spring.beans.annotion.controller.UserController;
import com.d.spring.beans.annotion.repository.UserRepository;
import com.d.spring.beans.annotion.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		TestObject to = (TestObject) ctx.getBean("testObject");
		System.out.println(to);
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);
		
		
	}

}
