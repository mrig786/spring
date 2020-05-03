package com.mrig.spring.springadv.stereotype.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inst")
@Scope("prototype")
public class Instructor {

    @Value("#{new Integer(17)}")
    private int id=13;

    @Value("#{T(java.lang.Math).abs(-17)}")
    private  int fee;

    @Value("#{2+4>5?false:true}")
    private boolean active;


    @Value("#{'Mrigendra'.toUpperCase()}")
    private String name;

    @Value("#{topics}")
    private List<String> topics;

    @Autowired
    private Profile profile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", fee=" + fee +
                ", active=" + active +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }


}
