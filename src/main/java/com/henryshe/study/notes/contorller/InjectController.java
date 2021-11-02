package com.henryshe.study.notes.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-10-13 16:37
 **/

@RestController
public class InjectController {
    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${price}")
    private Double price;

    @Value("${birthday}")
    private Date birthday;

    @Value("${sex}")
    private Boolean sex;

    @Value("${qqs}")
    private String[] qqs;

    @Value("${lists}")
    private List<String> lists;

    @Value("#{${maps}}")
    private Map<String, String> maps;

    @RequestMapping("inject")
    public String inject(){
        System.out.println("name= "+name);
        System.out.println("age= "+age);
        System.out.println("price= "+price);
        System.out.println("birthday= "+birthday);
        System.out.println("sex= "+sex);
        for(String qq: qqs){
            System.out.println("数组元素= "+ qq);
        }
        for(String list_item: lists) {
            System.out.println("List<String> 元素= " + list_item);
        }
        maps.forEach((key,value) -> System.out.println("key=" + key + " value=" + value));
        return "inject ok";
    }
}


