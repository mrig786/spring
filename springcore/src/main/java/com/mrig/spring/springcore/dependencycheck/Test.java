package com.mrig.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Perscription perscription= (Perscription) ctx.getBean("perscription");
        System.out.println(perscription);
    }
}
