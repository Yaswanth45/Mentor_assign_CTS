package com.cts.review_service.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.review_service.entity.Rating;
@Repository
public interface RatingRepository extends CrudRepository<Rating,Integer> {

    
}