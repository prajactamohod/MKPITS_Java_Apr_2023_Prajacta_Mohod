package com.example.demo.prodServiceImpl;

import com.example.demo.Repo.ProductRepo;
import com.example.demo.model.Product;
import com.example.demo.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdServiceImpl implements ProdService {
    private ProductRepo productRepo;

    @Autowired
    public ProdServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product createProduct(String id, String name, String price) {
        String random = UUID.randomUUID().toString();
        Product newProd = new Product();
        newProd.setId(random);
        return productRepo.save(newProd);
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> findById(String id) {
        return productRepo.findById(id);
    }


}
