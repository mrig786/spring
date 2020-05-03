package com.mrig.spring.springadv.autowiring.annotatons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired(required = false)
    @Qualifier("address11")
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
