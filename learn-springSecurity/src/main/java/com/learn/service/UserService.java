package com.learn.service;

import com.learn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> arr = new ArrayList<>();

    public UserService(){
        arr.add(new User("abc","ABC@gmail.com","abc123"));
        arr.add(new User("xyz","XYZ@gmail.com","xyz123"));
    }

    //get all user
    public List<User> getAllUser(){

        return this.arr;
    }
    //get by id

    public User getById(String username){
       return arr.stream().filter((arr)->arr.getUsername().equals(username)).findAny().orElse(null);

    }

    //add user
    public User addUser(User user){
        this.arr.add(user);
        return user;
    }

}