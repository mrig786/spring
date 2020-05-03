package com.mrig.spring.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Test {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Employee employee1= (Employee) ctx.getBean("empl");
        System.out.println(employee1.hashCode());
        Employee employee2= (Employee) ctx.getBean("empl");
        System.out.println(employee2.hashCode());

    }
}
