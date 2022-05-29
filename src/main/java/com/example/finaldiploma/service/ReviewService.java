package com.example.finaldiploma.service;


import com.example.finaldiploma.model.Review;

import com.example.finaldiploma.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    //Get All
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
