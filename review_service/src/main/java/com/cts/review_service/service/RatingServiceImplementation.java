package com.cts.review_service.service;

import java.util.Optional;

import com.cts.review_service.entity.Rating;
import com.cts.review_service.repo.RatingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImplementation {

    @Autowired
    public RatingRepository rRep;

   
	public void addRatings(Rating rat) {
		rRep.save(rat);
	}

    
	public Iterable<Rating> findAll() {
		return rRep.findAll();
    }
    
    
	public Optional<Rating> getByProductId(int productId) {
		return rRep.findById(productId);
    }
    
    
	public Optional<Rating> getByRamId(int ramId) {
		return rRep.findById(ramId);
    }
    
    
	public Optional<Rating> getByDisplayId(int displayId) {
		return rRep.findById(displayId);
    }
    
    
	public Optional<Rating> getByCameraId(int cameraId) {
		return rRep.findById(cameraId);
    }
    
    
	public Optional<Rating> getByBatteryId(int batteryId) {
		return rRep.findById(batteryId);
    }
    
    
	public Optional<Rating> getByProcessorId(int processorId) {
		return rRep.findById(processorId);
	}
}