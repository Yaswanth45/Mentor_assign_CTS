package com.cts.productservice.service;

import java.util.Optional;

import com.cts.productservice.entity.*;
import com.cts.productservice.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    public ProductRepository productRepository;

    public void addProductReview(Product product){
        productRepository.save(product);
    }

    public Optional<Product> findByProductId(int productId){
        return productRepository.findById(productId);
    }

    public void deleteProductReview(int productId){
        productRepository.deleteById(productId);
    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }
}