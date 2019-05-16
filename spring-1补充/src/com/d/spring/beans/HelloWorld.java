package com.d.spring.beans;

public class HelloWorld {
	private String name;

	public void setName2(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello:" + name);
	}
	
	public HelloWorld() {
		System.out.println("Hello World !");
	}
}
