package com.fomov.Paint.by.number.generator.controller;

import com.fomov.Paint.by.number.generator.model.User;
import com.fomov.Paint.by.number.generator.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") int id)
    {
            User user = userService.getUser(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
