package com.henryshe.entity;

import java.util.Date;

/**
 * @program: SpringStudyNotes
 * @description: 数据库对应的User表的对象
 * @author: shehy2
 * @create: 2021-11-04 16:37
 **/

public class User {
    private Integer id;
    private String name;
    private Date birthday;
    private Double salary;

    public User(){

    }

    public User(Integer id, String name, Date birthday, Double salary){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}


