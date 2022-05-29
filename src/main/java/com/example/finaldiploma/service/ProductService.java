package com.example.finaldiploma.service;


import com.example.finaldiploma.model.Product;
import com.example.finaldiploma.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAllProductByCategoryId(Long categoryId){
    return productRepository.findAllProductByCategoryId(categoryId);

}

}
