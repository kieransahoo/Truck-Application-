package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entities.User;
import com.demo.Service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public ResponseEntity<User> addUserHandler(@RequestBody User user){

        User newUser = userService.addUser(user);

        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }
    
}
