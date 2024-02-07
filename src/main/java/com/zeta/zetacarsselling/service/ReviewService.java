package com.zeta.zetacarsselling.service;

import com.zeta.zetacarsselling.model.Review;
import com.zeta.zetacarsselling.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Optional<Review> findOne(int id){
        return reviewRepository.findById(id);
    }

    public List<Review> findAll(){
        return reviewRepository.findAll();
    }

    public void save(Review review){
        reviewRepository.save(review);
    }

    public void delete(int id){
        reviewRepository.deleteById(id);
    }
}
