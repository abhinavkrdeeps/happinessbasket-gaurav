package com.virtusa.happinessbasket.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.JoinColumn;

@Entity
@Table(name="cartdetails")
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
 private int cartId;

 @OneToOne
 private Customer customer;
 
 private int quantity;
 
 @OneToMany
 private List<Product> product;

public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}

public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
