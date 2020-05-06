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

@Api(value = "The Camera Controller", description = "Rest controller for Camera")
@RestController
@CrossOrigin
public class CameraController {
    
    @Autowired
    public CameraService cameraService;

    //Operation on Camera

	@ApiOperation(value = "Add a Camera Review",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to insert a new Camera review details"
	)
	@RequestMapping(method=RequestMethod.POST,value="reviews/camera")
	void addReviews(@RequestBody Camera camera) {
		cameraService.addCameraReviews(camera);
	}
		
	@ApiOperation(value = "Get a Camera Review",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to get a Camera review details"
	)
	@RequestMapping("reviews/camera/{cid}")
	public ResponseEntity<Camera> getByCameraId(@PathVariable(name = "cid") int cameraId) {
		ResponseEntity<Camera> result;
		Camera entity = cameraService.getByCameraId(cameraId).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Camera>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Camera>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	
	@ApiOperation(value = "Delete a Camera Review",
	consumes = "A cameraId in JSON",
	notes = "Hit this URL to delete a Camera review details"
	)
	@RequestMapping(method = RequestMethod.DELETE, value = "reviews/delete/camera/{cameraId}")
	void deleteCameraReview(@PathVariable int cameraId) {
		cameraService.deleteCameraReview(cameraId);
	}
	
	@ApiOperation(value = "Get all Camera Reviews",
	consumes = "Nothing direct mapping",
	notes = "Hit this URL to get all Camera review details"
	)
	@RequestMapping("reviews/camera")
	public ResponseEntity<Iterable<Camera>> getAllCamera() {
		return new ResponseEntity<Iterable<Camera>>(cameraService.getAllCamera(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Get a Camera Review by ProductId",
	consumes = "A new Review in JSON",
	notes = "Hit this URL to get a Camera review details"
	)
	@RequestMapping("reviews/camera/products/{pid}")
	List<Camera> findByProductIdCamera(@PathVariable(name = "pid") int productId) {
		return cameraService.findByProductIdCamera(productId);
	}
}