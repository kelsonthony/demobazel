package com.kelsonthony.demobazel.controller;

import com.kelsonthony.demobazel.domain.User;
import com.kelsonthony.demobazel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    //private final UserRepository userRepository;

    // UserController(UserRepository userRepository) {
        //this.userRepository = userRepository;
    //}

    @GetMapping
    public String User() {

        return "Hello!";
    }

}
