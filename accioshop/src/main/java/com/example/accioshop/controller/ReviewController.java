package com.example.accioshop.controller;


import com.example.accioshop.exceptions.ReviewsNotFound;
import com.example.accioshop.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;


    //    make an api to get reviews by id
    @GetMapping
    public ResponseEntity getReviewsById(@RequestParam("id") int id){
//        the particular id can have reviews also and can not so we will use try catch block to handle it
        try{
            return new ResponseEntity(reviewService.getReviewsById(id), HttpStatus.FOUND);
        }
        catch (ReviewsNotFound e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
