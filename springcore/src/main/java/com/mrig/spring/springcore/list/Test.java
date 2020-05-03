package com.mrig.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Hospital hospital= (Hospital) ctx.getBean("hos");

        System.out.println(hospital.getName());
        System.out.println(hospital.getDepartments());
    }
}
