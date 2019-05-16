package com.d.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person444 = (Person)ctx.getBean("person4");
		System.out.println(person444);
		
		Person2 person25555 = (Person2)ctx.getBean("person25");
		System.out.println(person25555);
		
		Person personlist = (Person)ctx.getBean("personlist");
		System.out.println(personlist);
		
		System.out.println("_____________________________");
		
		 DataSource dataSource = ctx.getBean(DataSource.class);
		 System.out.println(dataSource.getProperties());
	}

}
