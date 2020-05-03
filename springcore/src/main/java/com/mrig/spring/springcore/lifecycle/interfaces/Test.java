package com.mrig.spring.springcore.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Patient patient= (Patient) ctx.getBean("patient");
        System.out.println(patient.getId());
        ctx.registerShutdownHook(); // for calling destroy method ... explicitly we need to register pre shutdown hook
    }
}
