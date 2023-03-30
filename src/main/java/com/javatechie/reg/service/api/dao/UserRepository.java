package com.javatechie.reg.service.api.dao;

import com.javatechie.reg.service.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
}
