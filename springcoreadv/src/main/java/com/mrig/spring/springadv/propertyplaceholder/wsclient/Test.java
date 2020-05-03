package com.mrig.spring.springadv.propertyplaceholder.wsclient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        WSClient wsClient= (WSClient) ctx.getBean("wsclient");
        System.out.println(wsClient);
    }
}
