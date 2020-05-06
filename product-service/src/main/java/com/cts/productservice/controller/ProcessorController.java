package com.cts.productservice.controller;


import java.util.List;

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

@Api(value = "The Processor ", description = "Rest controller for Processor")
@RestController
@CrossOrigin
public class ProcessorController {
    
    @Autowired
    public ProcessorService processorService;
    
    //Operation on Processor

	@ApiOperation(value = "Add a Processor Review",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to insert a new Processor review details"
	)
	@RequestMapping(method=RequestMethod.POST,value="reviews/processor")
	void addReviews(@RequestBody Processor pro) {
		processorService.addProcessorReview(pro);
	}
		
	@ApiOperation(value = "Get a Processor Review",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to get a Processor review details"
	)
	@RequestMapping("reviews/processor/{prid}")
	public ResponseEntity<Processor> getByProcessorId(@PathVariable(name = "prid") int processorId) {
		ResponseEntity<Processor> result;
		Processor entity = processorService.getByProcessorId(processorId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Processor>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Processor>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	
	@ApiOperation(value = "Delete a Processor Review",
	consumes = "A processorId in JSON",
	notes = "Hit this URL to delete a Processor review details"
	)
	@RequestMapping(method = RequestMethod.DELETE, value = "reviews/delete/processor/{processorId}")
	void deleteProcessorReview(@PathVariable int processorId) {
		processorService.deleteProcessorReview(processorId);
	}
	
	@ApiOperation(value = "Get all Processor Reviews",
	consumes = "Nothing direct mapping",
	notes = "Hit this URL to get all Processor review details"
	)
	@RequestMapping("reviews/processor")
	public ResponseEntity<Iterable<Processor>> getAllProcessor() {
		return new ResponseEntity<Iterable<Processor>>(processorService.getAllProcessor(),HttpStatus.OK);
	}

	
	@ApiOperation(value = "Get a Processor Review by ProductId",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to get a Processor review details"
	)
	@RequestMapping("reviews/processor/products/{pid}")
	List<Processor> findByProductIdProcessor(@PathVariable(name = "pid") int productId) {
		return processorService.findByProductIdProcessor(productId);
	}
	
}