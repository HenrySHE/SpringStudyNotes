package com.henryshe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-11-03 16:57
 **/

@SpringBootApplication
//@Mapper 注解:
@MapperScan("com.henryshe.dao") // 修饰范围: 用在类, 作用: 扫描DAO接口所在的包, 同时将所有DAO接口在工厂中创建对象
public class SpringbootDay3Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDay3Application.class, args);
    }
}

