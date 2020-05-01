package com.cts.review_service.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.review_service.entity.Reviews;
@Repository
public interface ReviewsRepository extends JpaRepository<Reviews,Integer> {

//	@Query("select review_text from reviews INNER JOIN product on reviews.products_p_id=product.p_id")
//	public Optional<Reviews> getByProductId(int productId);
}