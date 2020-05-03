package com.mrig.spring.springadv.propertyplaceholder;

public class MyDAO {
    private String serverName;

    MyDAO(String serverName){
        this.serverName=serverName;
    }

    @Override
    public String toString() {
        return "MyDAO{" +
                "serverName='" + serverName + '\'' +
                '}';
    }
}
