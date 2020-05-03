package com.mrig.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate= (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql="insert into employee values(?,?,?)";
        int result=jdbcTemplate.update(sql,new Integer(1),"Mrigendra","Bharti");
        System.out.println("Number of records inserted: "+result);
    }
}
