package com.mrig.spring.springcore.scope.university;

import org.springframework.beans.factory.annotation.Required;

public class University {
    private int id;
    private String name;
    private String clg;

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clg='" + clg + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }
}
