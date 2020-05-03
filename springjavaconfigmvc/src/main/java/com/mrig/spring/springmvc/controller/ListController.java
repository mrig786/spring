package com.mrig.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mrig.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/readList")
public ModelAndView sendObject() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("displayList");
	Employee employee = new Employee();
	employee.setId(1);
	employee.setName("Monu");
	employee.setSalary(1000.25);
	
	Employee employee1 = new Employee();
	employee1.setId(2);
	employee1.setName("Sonu");
	employee1.setSalary(1200.25);
	
	Employee employee2 = new Employee();
	employee2.setId(3);
	employee2.setName("Konu");
	employee2.setSalary(1020.25);
	
	ArrayList< Employee > employees=new ArrayList<Employee>();
	employees.add(employee);
	employees.add(employee2);
	employees.add(employee1);
	
	modelAndView.addObject("employees", employees);
	return modelAndView;
	
}
}
