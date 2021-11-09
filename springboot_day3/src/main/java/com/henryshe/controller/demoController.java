package com.henryshe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-11-09 10:23
 **/

@RestController
public class demoController {

    @RequestMapping("demo")
    public String demo(){
        System.out.println("demo after edited");
        return "demo hello";
    }
}


