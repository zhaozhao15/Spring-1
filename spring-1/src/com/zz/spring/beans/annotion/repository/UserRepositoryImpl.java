package com.zz.spring.beans.annotion.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zz.spring.beans.annotion.TestObject;

//bean�����ָպú�������һ�£����ж������ƥ���beanʱ���������
@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired(required = false)
	private TestObject testObject;
	
	@Override
	public void save() {
		System.out.println("UserRepository save...");
		System.out.println(testObject);
	}
}
