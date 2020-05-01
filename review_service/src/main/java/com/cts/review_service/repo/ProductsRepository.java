package com.cts.review_service.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.review_service.entity.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Integer> {

}
