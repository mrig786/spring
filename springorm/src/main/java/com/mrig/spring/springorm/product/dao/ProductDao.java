package com.mrig.spring.springorm.product.dao;

import com.mrig.spring.springorm.product.entity.Product;

import java.util.List;

public interface ProductDao {

    int insert(Product product);

    void update(Product product);

    void delete(Product product);

    Product find(int id);

    List<Product> findAll();
}
