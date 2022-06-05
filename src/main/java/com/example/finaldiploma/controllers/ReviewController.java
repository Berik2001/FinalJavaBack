package com.example.finaldiploma.controllers;

import com.example.finaldiploma.dto.OrderRequest;
import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.model.Order;
import com.example.finaldiploma.model.Review;
import com.example.finaldiploma.service.CategoryService;
import com.example.finaldiploma.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/read")
    private List<Review> getAllCategories() {
        return reviewService.getAllReviews();
    }

    @PostMapping("/create")
    private Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PutMapping
    private ResponseEntity<Review> updateReview(@RequestBody Review review) {
        Review newReview = reviewService.updateReview(review);
        return ResponseEntity.ok(newReview);
    }

}
