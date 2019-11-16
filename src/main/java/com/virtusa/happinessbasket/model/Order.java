package com.virtusa.happinessbasket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int orderId;
	
	@OneToOne
	private Cart cart;
	@OneToOne
	private Customer customer;
	@OneToOne
	private DeliveryPerson deliveryperson;
	private String status;
	
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DeliveryPerson getDeliveryperson() {
		return deliveryperson;
	}

	public void setDeliveryperson(DeliveryPerson deliveryperson) {
		this.deliveryperson = deliveryperson;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Order(int orderId, Cart cart, Customer customer, DeliveryPerson deliveryperson, String status) {
		super();
		this.orderId = orderId;
		this.cart = cart;
		this.customer = customer;
		this.deliveryperson = deliveryperson;
		this.status = status;
	}

	public Order() {
		super();
	}
	
	
	
}
