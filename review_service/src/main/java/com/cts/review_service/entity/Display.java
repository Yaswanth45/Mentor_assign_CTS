package com.cts.review_service.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Display")
public class Display {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="d_id")
    private int displayId;

    @Column(name="inches")
    private float inches;

    @ManyToOne
    private Products products;

    public Display(){
    	super();
    }

    public Display(int displayId){
    	super();
        this.displayId=displayId;
    }

    public int getDisplayId() {
        return displayId;
    }

    public void setDisplayId(int displayId) {
        this.displayId = displayId;
    }

    public float getInches() {
        return inches;
    }

    public void setInches(float inches) {
        this.inches = inches;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

}