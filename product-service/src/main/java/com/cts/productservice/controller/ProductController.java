package com.cts.productservice.controller;


import com.cts.productservice.entity.*;
import com.cts.productservice.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "The Product Controller", description = "Rest controller for Product")
@RestController
@CrossOrigin
public class ProductController {
    
    @Autowired
    public ProductService productService;  

	//Operation on Products

	@ApiOperation(value = "Add a Product Review",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to insert a new product's details"
	)
    @RequestMapping(method=RequestMethod.POST,value="reviews/products")
	void addProductReviews(@RequestBody Product product) {
		productService.addProductReview(product);
	}
	
	@ApiOperation(value = "Get a Product Review",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to get a  Product review details"
	)
	@RequestMapping("reviews/products/{p_id}")
	public ResponseEntity<Product> getByProductId(@PathVariable(name = "p_id") int productId) {
		ResponseEntity<Product> result;
		Product entity = productService.findByProductId(productId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Product>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return result;
    }
	
	@ApiOperation(value = "Delete a Product Review",
	consumes = "A productId in JSON",
	notes = "Hit this URL to delete a Product review details"
	)
	@RequestMapping(method = RequestMethod.DELETE, value = "reviews/delete/products/{productId}")
	void deleteProductReview(@PathVariable int productId) {
		productService.deleteProductReview(productId);
	}

	@ApiOperation(value = "Get all Reviews",
	consumes = "Nothing direct mapping",
	notes = "Hit this URL to get all review details"
	)
    @RequestMapping("reviews/products")
	public ResponseEntity<Iterable<Product>> findAll() {
		return new ResponseEntity<Iterable<Product>>(productService.findAll(),HttpStatus.OK);
	}
}