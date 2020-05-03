package com.mrig.spring.springjdbc.dao;

import com.mrig.spring.springjdbc.dto.Employee;

import java.util.List;

public interface EmployeeDao {

    int create(Employee employee);

    int update(Employee employee);

    int delete(int id);

    Employee get(int id);

    List<Employee> getAll();
}
