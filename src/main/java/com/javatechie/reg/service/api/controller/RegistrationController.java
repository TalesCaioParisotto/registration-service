package com.javatechie.reg.service.api.controller;

import com.javatechie.reg.service.api.dao.UserRepository;
import com.javatechie.reg.service.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {

    @Autowired
    private UserRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setId(UUID.randomUUID());
        repository.save(user);
        return "Hi " + user.getName() + " your Registration process successfully completed";
    }
}
