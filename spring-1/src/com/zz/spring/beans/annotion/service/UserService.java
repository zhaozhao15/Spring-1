package com.zz.spring.beans.annotion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zz.spring.beans.annotion.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(@Qualifier("userRepositoryImpl") UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void add() {
		System.out.println("UseService add...");
		userRepository.save();
	}
}
