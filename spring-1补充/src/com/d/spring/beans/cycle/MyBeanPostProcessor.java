package com.d.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/*
 * ����������bean 
 * */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("AfterInitialization: " + bean + " - " + beanName);
		/*
		 * if(){}
		 * ͨ������
		 * �ﵽѡ����������bean
		 * */
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeforeInitialization: " + bean + " - " + beanName);
		//һ��͵������
		Car car = new car();
		car.setBrand("Ford");

		return car;
	}

}
