package com.mrig.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
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


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside Init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
    }
}
