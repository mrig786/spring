package com.mrig.spring.springcore.reftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Student student= (Student) ctx.getBean("student");
        System.out.println(student.getScore());
    }
}
