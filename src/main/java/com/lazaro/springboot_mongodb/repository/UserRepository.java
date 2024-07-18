package com.lazaro.springboot_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lazaro.springboot_mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
