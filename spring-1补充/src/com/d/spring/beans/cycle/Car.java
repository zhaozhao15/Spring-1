package com.d.spring.beans.cycle;

public class Car {
	public Car () {
		System.out.println("Car's Constructor...");
	}
	
	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("Brand set");
	}
	
	public void init2() {
		System.out.println("init...");
	}
	
	public void destroy() {
		System.out.println("destroy...");
	}
	
	
	
}
