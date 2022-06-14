package com.example.finaldiploma.service;


import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.model.Product;
import com.example.finaldiploma.model.Question;
import com.example.finaldiploma.model.Review;
import com.example.finaldiploma.repository.CategoryRepository;
import com.example.finaldiploma.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Product> findAllProductByCategoryId(Long categoryId) {
        return productRepository.findAllProductByCategoryId(categoryId);

    }


    public Product updateProduct(Product product) {
        Product old = productRepository.getById(product.getId());
        old.setName(product.getName());
        old.setDescription(product.getDescription());
        old.setImage(product.getImage());
        old.setPrice(product.getPrice());
        old.setProductPrice(product.getProductPrice());

        productRepository.save(old);
        return old;
    }

    public Product createProduct(Product product) {
        Product newProduct = new Product();
        newProduct.setPrice(product.getPrice());
        newProduct.setName(product.getName());
        newProduct.setImage(product.getImage());
        newProduct.setDescription(product.getDescription());
        newProduct.setCategory(categoryRepository.getById(product.getCategory().getId()));
        newProduct.setProductPrice(product.getProductPrice());


        productRepository.save(newProduct);
        return newProduct;
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(Long.valueOf(id));
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
