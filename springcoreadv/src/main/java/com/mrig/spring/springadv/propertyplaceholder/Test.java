package com.mrig.spring.springadv.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        MyDAO myDAO= (MyDAO) ctx.getBean("myDAO");
        System.out.println(myDAO);
    }
}
