package com.mrig.spring.boot.jpa.springbootjpa.repos;

import org.springframework.data.repository.CrudRepository;

import com.mrig.spring.boot.jpa.springbootjpa.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
