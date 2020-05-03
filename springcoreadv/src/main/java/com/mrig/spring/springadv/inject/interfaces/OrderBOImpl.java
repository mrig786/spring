package com.mrig.spring.springadv.inject.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {
    @Autowired
    @Qualifier("dao2")
    private OderDAO dao;

    @Override
    public void placeOrder() {
        System.out.println("Inside method placeOrder()");
        dao.createOrder();
    }

    @Override
    public String toString() {
        return "OrderBOImpl{" +
                "dao=" + dao +
                '}';
    }

    public OderDAO getDao() {
        return dao;
    }

    public void setDao(OderDAO dao) {
        this.dao = dao;
    }
}
