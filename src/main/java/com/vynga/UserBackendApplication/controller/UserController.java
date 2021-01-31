package com.vynga.UserBackendApplication.controller;

import com.vynga.UserBackendApplication.entity.User;
import com.vynga.UserBackendApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepository userRepository;

     @GetMapping("/users")
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    @PostMapping("/users")
    public  void AddUsers(@RequestBody User user)
    {
        userRepository.save(user);
    }
}
