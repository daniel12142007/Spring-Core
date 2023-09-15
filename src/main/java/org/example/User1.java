package org.example;

import org.springframework.stereotype.Component;

@Component
public class User1 implements Inter {
    @Override
    public void back() {
        System.out.println("Hello back");
    }
}