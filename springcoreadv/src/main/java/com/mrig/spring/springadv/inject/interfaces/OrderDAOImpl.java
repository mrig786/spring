package com.mrig.spring.springadv.inject.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OderDAO {
    @Override
    public void createOrder() {
        System.out.println("Inside method createOder()");
    }
}
