package com.example.finaldiploma.controllers;

import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.model.Product;
import com.example.finaldiploma.model.Question;
import com.example.finaldiploma.model.Review;
import com.example.finaldiploma.service.ProductService;
import com.example.finaldiploma.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/create")
    public void save(@RequestBody Question question) {

        questionService.save(question);
    }

    @GetMapping
    private List<Question> getAllCategories() {
        return questionService.getAll();
    }

    @PutMapping
    private ResponseEntity<Question> updateQuestion(@RequestBody Question question) {
        Question newQuestion = questionService.updateQuestion(question);
        return ResponseEntity.ok(newQuestion);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> deleteQuestion(@PathVariable("id") int id) {
        questionService.deleteQuestion(id);
        return ResponseEntity.ok("deleted");
    }

}
