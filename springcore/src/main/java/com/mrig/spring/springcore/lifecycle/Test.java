package com.mrig.spring.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        TicketResevation ticketResevation= (TicketResevation) ctx.getBean("tktr");
        System.out.println(ticketResevation);
        ctx.registerShutdownHook();
    }
}
