package com.mrig.spring.springjdbc.dao.impl;

import com.mrig.spring.springjdbc.dao.EmployeeDao;
import com.mrig.spring.springjdbc.dao.rowmapper.EmployeeRowMapper;
import com.mrig.spring.springjdbc.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("empl")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Employee employee) {
        String sql = "insert into employee values(?,?,?)";
        int res = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
        return res;
    }

    @Override
    public int update(Employee employee) {
        String sql = "update employee set firstname=?, lastname=? where id=?";
        int res = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
        return res;
    }

    @Override
    public int delete(int id) {
        String sql = "delete from employee where id=?";
        int res = jdbcTemplate.update(sql, id);
        return res;
    }

    @Override
    public Employee get(int id) {
        String sql = "select * from employee where id =?";
        EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
        Employee employee = jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        String sql="select * from employee";
        EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
        List<Employee> employees=jdbcTemplate.query(sql,employeeRowMapper);
        return employees;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
