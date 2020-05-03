package com.mrig.spring.springjdbc.passanger.test;

import com.mrig.spring.springjdbc.passanger.dao.PassangerDao;
import com.mrig.spring.springjdbc.passanger.dto.Passanger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        PassangerDao passangerDao = (PassangerDao) ctx.getBean("passangerDao");
        Passanger passanger = new Passanger();
        passanger.setId(6);
        passanger.setSource("Bamgalore");
        passanger.setDestination("Udupi");
        passanger.setType("short");
        /*int insert = passangerDao.insert(passanger);
        System.out.println("Inserted rows: "+insert);*/

        /*int update = passangerDao.update(passanger);
        System.out.println("Updated rows: "+update);*/

        /*int delete= passangerDao.delete(4);
        System.out.println("Deleted rows: "+delete);*/

        /*Passanger passanger1=passangerDao.get(3);
        System.out.println(passanger1);*/

        List<Passanger> passangerList = passangerDao.getAll("long");
        for (Passanger p :
                passangerList) {
            System.out.println(p);
        }


    }
}
