package com.example.jdk17.entity;

/**
 * @author by wangwei
 * @date 2023/2/2 11:41
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
