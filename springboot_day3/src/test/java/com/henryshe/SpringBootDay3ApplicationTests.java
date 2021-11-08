package com.henryshe;

import com.henryshe.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: SpringStudyNotes
 * @description: 测试类
 * @author: shehy2
 * @create: 2021-11-08 17:01
 **/

@SpringBootTest
public class SpringBootDay3ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads(){
        userService.findAll().forEach(user -> System.out.println(user.getName()));
    }
}


