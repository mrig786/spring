package com.mrig.spring.springcore.innerbean;

public class Address {
    private int hNo;
    private String street;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "hNo=" + hNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int gethNo() {
        return hNo;
    }

    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
