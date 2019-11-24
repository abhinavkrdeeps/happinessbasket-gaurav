package com.virtusa.happinessbasket.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryid;
	
	private String categoryName;
	
	
	@OneToMany
	private List<Product> products;
	
	
	
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getCatid() {
		return categoryid;
	}
	public void setCatid(int catid) {
		this.categoryid = catid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category(int catid, String categoryName) {
		super();
		this.categoryid = catid;
		this.categoryName = categoryName;
	}
	public Category() {
	

	
}
}
