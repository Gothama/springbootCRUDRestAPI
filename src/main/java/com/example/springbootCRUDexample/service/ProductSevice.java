package com.example.springbootCRUDexample.service;

import com.example.springbootCRUDexample.entity.Product;
import com.example.springbootCRUDexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSevice {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
       return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product Removed";
    }

    public Product updateProduct(Product product){
        Product existing = repository.findById(product.getId()).orElse(null);
        existing.setName(product.getName());
        existing.setQuantiy(product.getQuantity());
        existing.setPrice(product.getPrice());
        return repository.save(existing);


    }


}
