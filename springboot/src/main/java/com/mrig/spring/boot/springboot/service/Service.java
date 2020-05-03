package com.mrig.spring.boot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrig.spring.boot.springboot.dao.Dao;

@org.springframework.stereotype.Service
public class Service {

	
	Dao dao;
	
	public Service(Dao dao) {
		System.out.println("Service bean created");
		this.dao=dao;
	}
	
	public void save() {
		dao.create();
	}
}
