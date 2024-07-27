package com.tejaswini;

import org.springframework.stereotype.Component;

//@Component("comp1")
@Component
public class Laptop implements Computer{

    public Laptop() {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile() {
        System.out.println("LAPTOP compiling......");
    }
}
