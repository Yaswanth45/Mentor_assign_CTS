package com.cts.review_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "Battery")
public class Battery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="b_id")
    private int batteryId;
    
    @Column(name="capacity")
    private String capacity;

    @ManyToOne
    private Products products;

    public Battery(){
    	super();
    }
    public Battery(int batteryId){
    	super();
        this.batteryId=batteryId;
    }

    public int getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(int batteryId) {
        this.batteryId = batteryId;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    
}