package com.springboot1.tejaswini.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compile Laptop");
    }
}
