package com.mrig.spring.springjdbc.test;

import com.mrig.spring.springjdbc.dao.EmployeeDao;
import com.mrig.spring.springjdbc.dto.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("empl");
        /*Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Rahul");
        employee.setLastName("Mehra");*/
        //int res = employeeDao.create(employee);
        //System.out.println("Number of rows inserted: " + res);
        /*int res= employeeDao.update(employee);
        System.out.println("Number of rows updated: " + res);*/
        /*int res= employeeDao.delete(employee.getId());
        System.out.println("Number of rows deleted: " + res);*/
        /*Employee employee=employeeDao.get(1);
        System.out.println(employee.getFirstName()+" "+employee.getLastName());*/

        List<Employee> employees=employeeDao.getAll();
        System.out.println("Employee record: "+employees);
    }
}
