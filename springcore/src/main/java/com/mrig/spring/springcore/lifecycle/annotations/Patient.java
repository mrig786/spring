package com.mrig.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside setter method");
        this.id = id;
    }
    @PostConstruct
    public void initHi(){
        System.out.println("Inside Init method");
    }
    @PreDestroy
    public void destroyBye(){
        System.out.println("Inside destroy method");
    }
}
