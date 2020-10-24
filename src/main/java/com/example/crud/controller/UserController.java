package com.example.crud.controller;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @PostMapping(value = "/create")
    public String createUser(@RequestBody User user) {
        User insertedUser = userRepository.insert(user);
        return "user created "+ insertedUser.getUsername();
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable String id) {
        return userRepository.findUserById(id);
    }
}
