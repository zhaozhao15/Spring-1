package com.d.spring.beans.factory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car = (Car) ctx.getBean("car1");
		System.out.println(car);
		
	}

}
