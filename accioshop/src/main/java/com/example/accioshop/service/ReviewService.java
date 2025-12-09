package com.example.accioshop.service;


import com.example.accioshop.exceptions.ReviewsNotFound;
import com.example.accioshop.model.Reviews;
import com.example.accioshop.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    ReviewsRepository reviewsRepository;

    public Reviews getReviewsById(int id){
        Optional<Reviews> optionalReviews = reviewsRepository.findById(id);
        if(optionalReviews.isEmpty()){
            throw new ReviewsNotFound("Invalid id");
        }
        Reviews getReviews = optionalReviews.get();
        return getReviews;
    }
}
