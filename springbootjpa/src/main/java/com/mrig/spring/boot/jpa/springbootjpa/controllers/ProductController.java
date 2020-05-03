package com.mrig.spring.boot.jpa.springbootjpa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrig.spring.boot.jpa.springbootjpa.entities.Product;
import com.mrig.spring.boot.jpa.springbootjpa.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	Iterable<Product> getProducts(){
		return repository.findAll();
	}
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id")Long id) {
		 Optional<Product> pOptional = repository.findById(id);
		 Product product = null;
		 if(pOptional.isPresent()) {
			 product=pOptional.get();
		 }
		 return product;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id")Long id) {
		  repository.deleteById(id);
	}

}
