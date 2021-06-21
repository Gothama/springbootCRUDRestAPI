package com.example.springbootCRUDexample.controller;

import com.example.springbootCRUDexample.entity.Product;
import com.example.springbootCRUDexample.repository.ProductRepository;
import com.example.springbootCRUDexample.service.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class ProductController {

    @Autowired
    private ProductSevice service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }






}
