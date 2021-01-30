package com.cybertek.controller;

import com.cybertek.entity.Product;
import com.cybertek.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
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
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){

        HttpHeaders responseHttpHeaders = new HttpHeaders();

        responseHttpHeaders.set("Version", "Cybertek.v1");
        responseHttpHeaders.set("Operation", "Get List");

        return ResponseEntity
                .ok()
                .headers(responseHttpHeaders)
                .body(productService.getProducts());

    }

    @PostMapping
    public ResponseEntity<List<Product>> createProduct(@RequestBody Product product) throws Exception {

        List<Product> set = productService.createProduct(product);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Version", "Cybertek.v1")
                .header("Operation", "Create")
                .body(set);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<List<Product>> deleteProduct(@PathVariable("id") long id){

        HttpHeaders responseHttpHeaders = new HttpHeaders();

        responseHttpHeaders.set("Version", "Cybertek.v1");
        responseHttpHeaders.set("Operation", "Delete");

        List<Product> list = productService.delete(id);

        return new ResponseEntity<>(list, responseHttpHeaders, HttpStatus.OK);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<List<Product>> updateProduct(@PathVariable("id") long id, @RequestBody Product product) throws Exception {

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("Version", "Cybertek.v1");
        map.add("Operation", "Update");

        List<Product> list = productService.updateProduct(id, product);

        return new ResponseEntity<>(list, map, HttpStatus.OK);

    }

}
