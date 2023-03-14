package com.fomov.Paint.by.number.generator.service.impl;

import com.fomov.Paint.by.number.generator.model.User;
import com.fomov.Paint.by.number.generator.repository.UserRepository;
import com.fomov.Paint.by.number.generator.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(int id) {
        Optional<User> optional = userRepository.findById(id);
        User user = optional.get();
        return user;
    }
}
