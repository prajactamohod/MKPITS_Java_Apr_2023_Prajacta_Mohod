package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProdService {

    Product createProduct(String id, String name, String price);
    List<Product> findAll();
    Optional<Product> findById(String id);
}
