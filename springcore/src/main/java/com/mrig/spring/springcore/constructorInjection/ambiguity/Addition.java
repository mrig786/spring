package com.mrig.spring.springcore.constructorInjection.ambiguity;

public class Addition {
    Addition(int a, double b,int c){
        System.out.println("Inside constructor double");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }



}
