package com.kelsonthony.demobazel.service;

import com.kelsonthony.demobazel.domain.User;
import com.kelsonthony.demobazel.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository repository;

    public List<User> findAll() {
        List<User> users = repository.findAll();
        return users;
    }

}
