package com.cts.review_service.entity;

import javax.persistence.*;

@Entity
@Table(name = "Ram")
public class Ram {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="r_id")
	private int ramId;
	
	@Column(name="ram_size")
	private int ramSize;
	
	@ManyToOne
	private Products products;
	
	public Ram() {
		super();
	}
	
	public Ram(int ramId) {
		super();
		this.ramId=ramId;
	}

	public int getRamId() {
		return ramId;
	}

	public void setRamId(int ramId) {
		this.ramId = ramId;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

}