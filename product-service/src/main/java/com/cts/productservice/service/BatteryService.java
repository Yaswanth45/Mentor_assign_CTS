package com.cts.productservice.service;


import java.util.List;
import java.util.Optional;

import com.cts.productservice.entity.*;
import com.cts.productservice.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatteryService {
    
    @Autowired
    public BatteryRepository batteryRepository;

    public void addBatteryReviews(Battery battery){
        batteryRepository.save(battery);
    }

    public Optional<Battery> getByBatteryId(int batteryId){
        return batteryRepository.findById(batteryId);
    }

    public List<Battery> findByProductId(int productId){
        return batteryRepository.findByProductId(productId);
    }

    public void deleteReview(int batteryId) {
		batteryRepository.deleteById(batteryId);	
	}

    public Iterable<Battery> getAllBattery(){
        return batteryRepository.findAll();
    }
}