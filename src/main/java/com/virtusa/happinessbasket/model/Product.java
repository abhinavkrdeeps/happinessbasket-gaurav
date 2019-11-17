package com.virtusa.happinessbasket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	private int categoryId;
	private String description;
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private float productCost;
	private int quantity;
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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
	
	public float getProductCost() {
		return productCost;
	}
	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int categoryId, int productId, String productName, float productCost, int quantity) {
		super();
		this.categoryId = categoryId;
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	
	
	
	
}
