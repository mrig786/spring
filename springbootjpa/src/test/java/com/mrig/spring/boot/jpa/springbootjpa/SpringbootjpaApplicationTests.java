package com.mrig.spring.boot.jpa.springbootjpa;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.mrig.spring.boot.jpa.springbootjpa.entities.Product;
import com.mrig.spring.boot.jpa.springbootjpa.repos.ProductRepository;

@SpringBootTest
class SpringbootjpaApplicationTests {

	@Autowired
	ApplicationContext context;
	@Test
	void saveProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(4l);
		product.setName("Redmi Note 4");
		product.setDescription("Durable");
		product.setPrice(11000d);
		productRepository.save(product);
	}
	@Test
	void readProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		long id = 4l;
		Optional<Product> prdOptional = productRepository.findById(id);
		if(prdOptional.isPresent()) {
			Product product=prdOptional.get();
			System.out.println(product);
		}
		
	}

}
