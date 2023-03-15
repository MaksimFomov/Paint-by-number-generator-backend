package com.fomov.Paint.by.number.generator.service.impl;

import com.fomov.Paint.by.number.generator.model.User;
import com.fomov.Paint.by.number.generator.repository.UserRepository;
import com.fomov.Paint.by.number.generator.service.ServiceException;
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
    public User authorization(User user) throws ServiceException {
        try {
            Optional<User> optional = userRepository.findByEmail(user.getEmail());
            if (optional.get().getPassword().equals(user.getPassword())) {
                return optional.get();
            }
            throw new ServiceException();
        } catch (Exception e){
            throw new ServiceException(e);
        }
    }

    @Override
    public User registration(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        Optional<User> optional = userRepository.findById(id);
        User user = optional.get();
        return user;
    }
}
