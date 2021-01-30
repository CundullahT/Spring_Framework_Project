package com.cybertek.controller;

import com.cybertek.entity.Product;
import com.cybertek.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)   // In default it is already method = RequestMethod.GET
    public @ResponseBody Product getProduct(@PathVariable("id") Long id) throws Exception {
        return productService.getProduct(id);
    }

    @RequestMapping(value = "/products")
    public @ResponseBody List<Product> getProduct(){
        return productService.getProducts();
    }

    @PostMapping(value = "/products")
    public @ResponseBody List<Product> createProduct(@RequestBody Product product) throws Exception {
        return productService.createProduct(product);
    }

    @DeleteMapping(value = "/products/{id}")
    public @ResponseBody List<Product> deleteProduct(@PathVariable("id") long id){
        return productService.delete(id);
    }

    @PutMapping(value = "/products/{id}")
    public @ResponseBody List<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product) throws Exception {
        return productService.updateProduct(id, product);
    }

}
