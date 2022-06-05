package com.example.finaldiploma.service;


import com.example.finaldiploma.model.Category;
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

    public Review updateReview(Review review) {
        Review old = reviewRepository.getById(review.getId());
        old.setReview(review.getReview());
        old.setReviewDesc(review.getReviewDesc());
        old.setReviewUsername(review.getReviewUsername());

        reviewRepository.save(old);
        return old;
    }

    public Review createReview(Review review) {
        Review newReview = new Review();
        if (review.getReview() != null) {
            newReview.setReview(review.getReview());
        }else {
            newReview.setReview(review.getReviewUsername());
        }
        newReview.setReviewDesc(review.getReviewDesc());
        newReview.setReviewUsername(review.getReviewUsername());

        reviewRepository.save(newReview);
        return newReview;
    }
}
