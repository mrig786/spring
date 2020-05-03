package com.mrig.spring.springadv.stereotype.annotation;

import com.mrig.spring.springadv.standalone.collections.ProductList;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Instructor instructor1= (Instructor) ctx.getBean("inst");
        System.out.println(instructor1);
        Instructor instructor2= (Instructor) ctx.getBean("inst");
        System.out.println(instructor2);
    }
}
