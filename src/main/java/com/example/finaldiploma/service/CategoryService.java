package com.example.finaldiploma.service;


import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //Get By Id
    public Optional<Category> getById(Long id) {

        return categoryRepository.findById(id);
    }

    //Get All
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    //Save Category
    public void save(Category category) {

        categoryRepository.save(category);
    }


    public Category createCategory(Category category) {
        Category newCategory = new Category();
        newCategory.setImg(category.getImg());
        newCategory.setName(category.getName());

        categoryRepository.save(newCategory);

        return newCategory;
    }

    public Category updateCategory(Category category) {
        Category old = categoryRepository.getById(category.getId());
        old.setImg(category.getImg());
        old.setName(category.getName());

        categoryRepository.save(old);
        return old;
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}

