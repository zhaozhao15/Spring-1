package com.d.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.d.spring.beans.collections.DataSource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		//1 .����HelloWorld��һ������
		HelloWorld helloWorld = new HelloWorld();
		//2. Ϊname���Ը�ֵ
		helloWorld.setName("Dan");
		*/
		
		//1. ����Spring��IOC�������󣬴˲���ɺ��췽����set������ִ�����
		//ApplicationContext��������
		//ClassPathXmlApplicationContext:��ApplicationContext�ӿڵ�ʵ���࣬��ʵ�������·���¼��������ļ���
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. ��IOC�������л�ȡBeanʵ��
		//HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//3. ����hello����
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
