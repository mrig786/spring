package com.mrig.spring.springcore.constructorInjection.ambiguity;

import com.mrig.spring.springcore.constructorInjection.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Addition addition= (Addition) ctx.getBean("add");
        System.out.println(addition);
    }
}
