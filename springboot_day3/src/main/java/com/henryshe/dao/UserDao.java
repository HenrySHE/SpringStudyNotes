package com.henryshe.dao;

import com.henryshe.entity.User;

import java.util.List;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-11-04 16:48
 **/

public interface UserDao {
    //查询所有
    List<User> findAll();
}


