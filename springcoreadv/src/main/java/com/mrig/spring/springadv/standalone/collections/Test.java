package com.mrig.spring.springadv.standalone.collections;

import com.mrig.spring.springadv.propertyplaceholder.MyDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ProductList productList= (ProductList) ctx.getBean("prd");
        System.out.println(productList);
    }
}
