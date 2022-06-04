package com.example.finaldiploma.controllers;


import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    private List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/categories")
    private Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/categories")
    private ResponseEntity<Category> updateCategory(@RequestBody Category category) {
        Category newCategory = categoryService.updateCategory(category);
        return ResponseEntity.ok(newCategory);
    }

    @DeleteMapping("/categories/{id}")
    private ResponseEntity<String> deleteCategory(@PathVariable ("id") Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.ok("deleted");
    }

}
