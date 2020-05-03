package com.mrig.spring.springorm.product.test;

import com.mrig.spring.springorm.product.dao.ProductDao;
import com.mrig.spring.springorm.product.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        ProductDao productDao=(ProductDao) ctx.getBean("productDao");
        Product product=new Product();
        product.setId(3);
        product.setDesc("Laptop");
        product.setName("Acer Aspire");
        product.setPrice(9000);
//        productDao.insert(product);
//        productDao.update(product);
//        productDao.delete(product);
        /*Product product1=productDao.find(2);
        System.out.println(product1);*/

        List<Product> products=productDao.findAll();
        System.out.println(products);
    }
}
