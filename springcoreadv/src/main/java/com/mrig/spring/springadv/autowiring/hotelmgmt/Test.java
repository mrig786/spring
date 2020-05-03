package com.mrig.spring.springadv.autowiring.hotelmgmt;

import com.mrig.spring.springadv.autowiring.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Customer customer= (Customer) ctx.getBean("cus");
        System.out.println(customer);
    }
}
