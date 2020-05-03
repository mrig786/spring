package com.mrig.spring.springadv.inject.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OderDAO {
    @Override
    public void createOrder() {
System.out.println("Inside method createOrder() of OrderDAOImpl2");
    }
}
