package com.mrig.spring.springcore.shoppingcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        ShoppingCart shoppingCart= (ShoppingCart) ctx.getBean("shcrt");
        System.out.println(shoppingCart.getItem());

    }
}
