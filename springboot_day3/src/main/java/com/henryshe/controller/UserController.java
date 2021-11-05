package com.henryshe.controller;

import com.henryshe.entity.User;
import com.henryshe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-11-04 17:10
 **/

public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("findAll")
    public List<User> findAll(){
        System.out.println("findAll...");
        List<User> results = userService.findAll();
        for (User userItem :results){
            String birthday = userItem.getBirthday().toString();
            String name = userItem.getName();
            System.out.println(birthday + "\t" + name);
        }
        return userService.findAll();
    }

}


