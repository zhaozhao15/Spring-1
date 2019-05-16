package com.zz.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

//�Զ����FactoryBean��Ҫʵ��FactoryBean�ӿ�
public class CarFactoryBean implements FactoryBean<Car> {
	
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//����bean�Ķ���
	@Override
	public Car getObject() throws Exception {
		return new Car(brand,500000);
	}
	
	//����bean������
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
