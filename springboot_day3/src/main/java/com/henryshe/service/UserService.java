package com.henryshe.service;

import com.henryshe.entity.User;

import java.util.List;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-11-04 16:55
 **/

public interface UserService {
    List<User> findAll();
}


