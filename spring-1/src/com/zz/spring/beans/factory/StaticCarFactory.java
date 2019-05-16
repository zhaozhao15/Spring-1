package com.zz.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/*
 * ��̬����������ֱ�ӵ���ĳһ����ľ�̬�����Ϳ��Է���һ��beanʵ��
 * */
public class StaticCarFactory {
	
	private static Map<String, Car> cars = new HashMap<String, Car>();
	
	static {
		cars.put("audi",new Car("audi",300000));
		cars.put("ford",new Car("ford",300000));
	}
	
	//��̬��������
	public static Car getCar(String name)
	{
		return cars.get(name);
	}

}
