package com.wzg.service;
/**
 * @ClassName User
 * @Description TODO
 * @Author Administrator
 * Date 2019/2/17 13:27
 * version 1.0
 **/
public class User {//类内右击，建立各种方法
     private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
     private int age;
}
