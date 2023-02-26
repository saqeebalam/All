package com.learn.controller;

import com.learn.model.User;
import com.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserService service;
    //get all user

    @GetMapping("/")
   // @PreAuthorize("hasRole('ADMIN')")
    public List<User> getAllUsers(){
       return service.getAllUser();
    }
    //get by id
    @GetMapping("/{username}")
    public User getById(@PathVariable("username") String username){
       return service.getById(username);
    }
    //add useer
    @PostMapping("/")
    public User addUser(User user){
        return service.addUser(user);
    }

}
