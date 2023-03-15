package com.fomov.Paint.by.number.generator.controller;

import com.fomov.Paint.by.number.generator.model.User;
import com.fomov.Paint.by.number.generator.service.ServiceException;
import com.fomov.Paint.by.number.generator.service.UserService;
import com.fomov.Paint.by.number.generator.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/authorization", method = RequestMethod.GET)
    public ResponseEntity<Object> authorization(@RequestBody User user) throws ServiceException {
        try {
            user = userService.authorization(user);
            return new ResponseEntity<>("True = " + user.getId(), HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }

    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity<Object> registration(@RequestBody User user)
    {
        user = userService.registration(user);
        return new ResponseEntity<>("User is created successfully with id = " + user.getId(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") int id)
    {
            User user = userService.getUser(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
