package com.mrig.spring.springcore.scope.university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        University university= (University) ctx.getBean("unv");
        System.out.println(university.hashCode());
        University university1=(University) ctx.getBean("unv");
        System.out.println(university1.hashCode());
    }
}
