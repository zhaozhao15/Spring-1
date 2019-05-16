package com.d.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.d.spring.beans.collections.DataSource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		//1 .创建HelloWorld的一个对象
		HelloWorld helloWorld = new HelloWorld();
		//2. 为name属性赋值
		helloWorld.setName("Dan");
		*/
		
		//1. 创建Spring的IOC容器对象，此步完成后构造方法和set方法均执行完毕
		//ApplicationContext代表容器
		//ClassPathXmlApplicationContext:是ApplicationContext接口的实现类，该实现类从类路径下加载配置文件。
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. 从IOC容器中中获取Bean实例
		//HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//3. 调用hello方法
		//helloWorld.hello();
		Car car = (Car) ctx.getBean("car");
		System.out.println(car.toString());
	    car = (Car) ctx.getBean("car2"); 
	    System.out.println(car.toString());
	    
	    Person person = (Person)ctx.getBean("person");
	    System.out.println(person);
	    
	    Person person22222 = (Person)ctx.getBean("person3");
	    System.out.println(person22222);
	    
	   
	    
	}

}
