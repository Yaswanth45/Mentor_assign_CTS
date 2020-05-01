package com.cts.review_service.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Product")
public class Products {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="p_id")
	private int productId;
	
	@Column(name="p_name")
	private String productName;
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Products() {
		super();
	}
	
	public Products(int productId) {
		super();
		this.productId=productId;
	}
}