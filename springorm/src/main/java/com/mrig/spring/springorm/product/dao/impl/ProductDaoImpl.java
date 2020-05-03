package com.mrig.spring.springorm.product.dao.impl;

import com.mrig.spring.springorm.product.dao.ProductDao;
import com.mrig.spring.springorm.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int insert(Product product) {
        Integer res = (Integer) hibernateTemplate.save(product);
        return 0;
    }

    @Override
    @Transactional
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Product find(int id) {
        Product product = hibernateTemplate.get(Product.class, id);
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = hibernateTemplate.loadAll(Product.class);
        return products;
    }
}
