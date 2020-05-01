package com.cts.review_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "Camera")
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="c_id")
    private int cameraId;
    
    @Column(name="resolution")
    private int resolution;

    @ManyToOne
    private Products products;

    public Camera(){
    	super();
    }

    public Camera(int cameraId){
    	super();
        this.cameraId=cameraId;
    }

    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

}