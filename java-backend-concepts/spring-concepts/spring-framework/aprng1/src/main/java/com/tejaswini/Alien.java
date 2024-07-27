package com.tejaswini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;

//    @Qualifier("laptop")
//    @Qualifier("comp1")
    private Computer comp;

    public Alien() {
        System.out.println("Alien object created");
    }

//    public Alien(int age, Computer comp) {
//        System.out.println("Param constructor called");
//        this.age = age;
//        this.comp = comp;
//    }

    public void code() {
        System.out.println("Code");
        comp.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }


    @Autowired
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
