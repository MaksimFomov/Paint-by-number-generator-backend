package com.fomov.Paint.by.number.generator.service;

import com.fomov.Paint.by.number.generator.model.User;

public interface UserService {
    User registration(User user);
    User authorization(User user) throws ServiceException;
    User getUser(int id);
}
