package com.mrig.spring.springadv.inject.interfaces;

import com.mrig.spring.springadv.stereotype.annotation.Instructor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        OrderBOImpl orderBO= (OrderBOImpl) ctx.getBean("bo");
        orderBO.placeOrder();

    }
}
