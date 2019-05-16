package com.zz.spring.beans.annotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zz.spring.beans.annotion.controller.UserController;
import com.zz.spring.beans.annotion.repository.UserRepository;
import com.zz.spring.beans.annotion.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("zzbeans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
//		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
//		
//		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//		System.out.println(userRepository);
	}
}
