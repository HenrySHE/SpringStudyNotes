package com.henryshe.study.notes.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-09-16 16:33
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("========================");
        return "hello springboot";
    }

}


