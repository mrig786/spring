package com.mrig.spring.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketResevation {
    private int id;
    private String status;

    @Override
    public String toString() {
        return "TicketResevation{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @PostConstruct
    public void initialize(){
        System.out.println("Inside initialize method");
    }
    @PreDestroy
    public void cleanUp(){
        System.out.println("Inside clean up method");
    }
}
