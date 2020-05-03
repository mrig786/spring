package com.mrig.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee employee= (Employee) ctx.getBean("emp");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
