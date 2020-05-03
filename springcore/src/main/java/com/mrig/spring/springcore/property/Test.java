package com.mrig.spring.springcore.property;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Language language= (Language) ctx.getBean("lan");
        System.out.println(language.getProperties());
    }
}
