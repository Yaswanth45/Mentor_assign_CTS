package com.cts.review_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "Reviews")
public class Reviews {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rev_id")
    private int reviewId;

    @Column(name="review_text")
    private String reviewText;
    
    @ManyToOne
    private Products products;


    @ManyToOne
    private Ram ram;

    @ManyToOne
    private Processor processor;

    @ManyToOne
    private Display display;

    @ManyToOne
    private Camera camera;

    @ManyToOne
    private Battery battery;

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    
}