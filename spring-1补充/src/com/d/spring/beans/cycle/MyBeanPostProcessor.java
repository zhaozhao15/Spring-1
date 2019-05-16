package com.d.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/*
 * 作用于所有bean 
 * */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("AfterInitialization: " + bean + " - " + beanName);
		/*
		 * if(){}
		 * 通过过滤
		 * 达到选择性作用于bean
		 * */
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeforeInitialization: " + bean + " - " + beanName);
		//一个偷梁换柱
		Car car = new car();
		car.setBrand("Ford");

		return car;
	}

}
