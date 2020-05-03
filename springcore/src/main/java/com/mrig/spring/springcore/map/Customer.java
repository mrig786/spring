package com.mrig.spring.springcore.map;

import java.util.Map;

public class Customer {
    private String name;
    private Map<Integer,String> prdMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, String> getPrdMap() {
        return prdMap;
    }

    public void setPrdMap(Map<Integer, String> prdMap) {
        this.prdMap = prdMap;
    }
}
