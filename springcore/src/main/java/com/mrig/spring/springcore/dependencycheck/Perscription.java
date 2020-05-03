package com.mrig.spring.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Perscription {
    private int id;

    private String name;
    private List<String> medicines;

    @Override
    public String toString() {
        return "Perscription{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medicines=" + medicines +
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

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }
}
