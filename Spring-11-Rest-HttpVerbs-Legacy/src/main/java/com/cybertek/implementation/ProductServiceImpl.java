package com.cybertek.implementation;

import com.cybertek.entity.Product;
import com.cybertek.repository.ProductRepository;
import com.cybertek.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> delete(long id) {
        productRepository.deleteById(id);
        return getProducts();
    }

    @Override
    public List<Product> updateProduct(long id, Product product) throws Exception {
        Optional<Product> foundedProduct = productRepository.findById(id);

        if (foundedProduct.isEmpty()) throw new Exception("There is no such product.");

        foundedProduct.get().setName(product.getName());
        productRepository.save(foundedProduct.get());

        return getProducts();
    }

    @Override
    public List<Product> createProduct(Product product) throws Exception {

        Optional<Product> foundedProduct = productRepository.findById(product.getId());

        if (foundedProduct.isPresent()) throw new Exception("Product already exists.");

        productRepository.save(product);

        return getProducts();
    }

    @Override
    public Product getProduct(long id) throws Exception {

        Optional<Product> foundedProduct = productRepository.findById(id);

        if (foundedProduct.isEmpty()) throw new Exception("There is no such product");

        return foundedProduct.get();
    }

}
