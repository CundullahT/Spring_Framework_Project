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

    @GetMapping(value = "/{id}")   // In default it is already method = RequestMethod.GET
    public Product getProduct(@PathVariable("id") Long id) throws Exception {
        return productService.getProduct(id);
    }

    @GetMapping
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @PostMapping
    public List<Product> createProduct(@RequestBody Product product) throws Exception {
        return productService.createProduct(product);
    }

    @DeleteMapping(value = "/{id}")
    public List<Product> deleteProduct(@PathVariable("id") long id){
        return productService.delete(id);
    }

    @PutMapping(value = "/{id}")
    public List<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product) throws Exception {
        return productService.updateProduct(id, product);
    }

}
