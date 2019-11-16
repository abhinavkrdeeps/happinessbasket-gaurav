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
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.JoinColumn;

@Entity
@Table(name="cartdetails")
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
 private int cartId;
 private int customerId;
 private int quantity;
 
//@ElementCollection
////@JoinTable(name = "Cart_Product", joinColumns = { @JoinColumn(name = "cart_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })
//private List<Product> productList = new ArrayList<Product>();

public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
//public List<Product> getProductList() {
//	return productList;
//}
//public void setProductList(List<Product> productList) {
//	this.productList = productList;
//}
//@Override
//public String toString() {
//	return "Cart [cartId=" + cartId + ", customerId=" + customerId + ", quantity=" + quantity + ", productList="
//			+ productList + "]";
//}

}
