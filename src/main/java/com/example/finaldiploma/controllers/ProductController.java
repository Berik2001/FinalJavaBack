package com.example.finaldiploma.controllers;


import com.example.finaldiploma.model.Product;
import com.example.finaldiploma.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{categoryId}")
    private List<Product> findAllProductByCategoryId(@PathVariable Long categoryId) {
        return productService.findAllProductByCategoryId(categoryId);
    }
}
