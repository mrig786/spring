package com.mrig.spring.boot.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.mrig.spring.boot.springboot.service.Service;

@SpringBootTest
class SpringbootApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void testServices() {
		Service service = context.getBean(Service.class);
		service.save();
	}

}
