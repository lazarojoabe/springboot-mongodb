package com.lazaro.springboot_mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaro.springboot_mongodb.domain.User;
import com.lazaro.springboot_mongodb.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
