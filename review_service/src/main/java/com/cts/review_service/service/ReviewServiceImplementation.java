package com.cts.review_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.review_service.entity.Reviews;
import com.cts.review_service.repo.ReviewsRepository;
@Service
public class ReviewServiceImplementation {

    @Autowired
    public ReviewsRepository proRep;
    
    
	public void addReviews(Reviews pro) {
		proRep.save(pro);
	}

   
	public Iterable<Reviews> findAll() {
		return proRep.findAll();
    }
    
    
	public Optional<Reviews> getByProductId(int productId) {
		return proRep.findById(productId);
    }
    
    
	public Optional<Reviews> getByRamId(int ramId) {
		return proRep.findById(ramId);
    }
    
    
	public Optional<Reviews> getByDisplayId(int displayId) {
		return proRep.findById(displayId);
    }
    
    
	public Optional<Reviews> getByCameraId(int cameraId) {
		return proRep.findById(cameraId);
    }
    
    
	public Optional<Reviews> getByBatteryId(int batteryId) {
		return proRep.findById(batteryId);
    }
    
    
	public Optional<Reviews> getByProcessorId(int processorId) {
		return proRep.findById(processorId);
	}
}