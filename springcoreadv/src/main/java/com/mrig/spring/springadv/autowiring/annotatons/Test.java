package com.mrig.spring.springadv.autowiring.annotatons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Test {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Employee employee= (Employee) ctx.getBean("emp");
        System.out.println(employee);
    }
}
