package com.cybertek.controller;

import com.cybertek.entity.Product;
import com.cybertek.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)   // In default it is already method = RequestMethod.GET
    public Product getProduct(@PathVariable("id") Long id) throws Exception {
        return productService.getProduct(id);
    }

    @RequestMapping(value = "/")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public List<Product> createProduct(@RequestBody Product product) throws Exception {
        return productService.createProduct(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public List<Product> deleteProduct(@PathVariable("id") long id){
        return productService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public List<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product) throws Exception {
        return productService.updateProduct(id, product);
    }

}
