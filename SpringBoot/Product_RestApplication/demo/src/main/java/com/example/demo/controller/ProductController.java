package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProdService prodService;

    @Autowired
    public ProductController(ProdService prodService) {
        this.prodService = prodService;
    }

    @PostMapping
    public ResponseEntity createProd(@RequestParam String id, @RequestParam String name, @RequestParam String price) {
       Product newProd = prodService.createProduct(id, name, price);
        return ResponseEntity.ok(newProd);
    }

    @GetMapping
    public ResponseEntity findAllProd() {
        List<Product> newProd = prodService.findAll();
        return ResponseEntity.ok(newProd);
    }

    @GetMapping("/{id}")
    public ResponseEntity findProdById(@PathVariable String id) {
        Optional<Product> newProd = prodService.findById(id);
        return ResponseEntity.ok(newProd);
    }
}
