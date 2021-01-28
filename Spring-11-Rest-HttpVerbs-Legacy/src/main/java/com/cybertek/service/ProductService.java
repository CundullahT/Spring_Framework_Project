package com.cybertek.service;

import com.cybertek.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    List<Product> delete(long id);
    List<Product> updateProduct(long id, Product product) throws Exception;
    List<Product> createProduct(Product product) throws Exception;
    Product getProduct(long id) throws Exception;

}
