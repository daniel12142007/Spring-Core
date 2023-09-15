package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Inter inter;

    @Autowired
    public User(Inter inter) {
        this.inter = inter;
    }

    public Inter getInter() {
        return inter;
    }

    public void setInter(Inter inter) {
        this.inter = inter;
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

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }


}