package com.henryshe.study.notes.contorller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringStudyNotes
 * @description: 测试对象注入, 参考视频P9([P09]8.属性注入)
 * @author: shehy2
 * @create: 2021-11-02 17:20
 **/

@RestController
@ConfigurationProperties("orders")//修饰范围: 只能用在类上; 作用: 用来指定前缀的属性, 注入到当前对象中属性名一致的属性中
//@ConfigurationProperties(prefix = "orders") //也可以
//@ConfigurationProperties(value = "orders")
//注意, 必须提供SET方法
public class InjectionObjectController {

    private String name;
    private Integer id;
    private Double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @RequestMapping("injectObject")
    public String injectObject(){
        System.out.println("InjectObject ok");
        System.out.println("name is:" + name);
        System.out.println("id is: " + id);
        System.out.println("price is: "+ price);
        return "InjectObject ok, name: " + name + "; id is: "+ id + "; price is: "+ price;
    }
}


