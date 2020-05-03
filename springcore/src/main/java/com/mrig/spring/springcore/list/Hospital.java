package com.mrig.spring.springcore.list;

import java.util.List;
import java.util.Set;

public class Hospital {

    private String name;

    private Set<String> departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<String> departments) {
        this.departments = departments;
    }
}
