package com.zeta.zetacarsselling.controller;

import com.zeta.zetacarsselling.model.Review;
import com.zeta.zetacarsselling.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/review")
public class ReviewController {
    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/{reviewId}")
    public Optional<Review> findOne(@PathVariable int reviewId){
        return reviewService.findOne(reviewId);
    }

    @GetMapping("/")
    public List<Review> findAll(){
        return reviewService.findAll();
    }

    @PostMapping("/")
    public void post(@RequestBody Review review){
        reviewService.save(review);
    }

    @PutMapping("/")
    public void update(@RequestBody Review review){
        reviewService.save(review);
    }

    @DeleteMapping("/{reviewId}")
    public void delete(@PathVariable int reviewId){
        reviewService.delete(reviewId);
    }
}
