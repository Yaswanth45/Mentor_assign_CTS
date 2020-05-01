package com.cts.review_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "Processor")
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pr_id")
    private int processorId;

    @Column(name="pr_name")
    private String processorName;

    @ManyToOne
    private Products products;

    public Processor(){
    	super();
    }

    public Processor(int processorId){
    	super();
        this.processorId=processorId;
    }

    public int getProcessorId() {
        return processorId;
    }

    public void setProcessorId(int processorId) {
        this.processorId = processorId;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    
}