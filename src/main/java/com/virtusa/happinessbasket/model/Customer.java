package com.virtusa.happinessbasket.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String firstCusName;
	private String lastCusName;
	private String customerPhone;
	private String cusemailId;
	private String cuspassword;
	

	

	@OneToOne
	private Cart cart;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstCusName() {
		return firstCusName;
	}

	public void setFirstCusName(String firstCusName) {
		this.firstCusName = firstCusName;
	}

	public String getLastCusName() {
		return lastCusName;
	}

	public void setLastCusName(String lastCusName) {
		this.lastCusName = lastCusName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCusemailId() {
		return cusemailId;
	}

	public void setCusemailId(String cusemailId) {
		this.cusemailId = cusemailId;
	}

	public String getCuspassword() {
		return cuspassword;
	}

	public void setCuspassword(String cuspassword) {
		this.cuspassword = cuspassword;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	

	
	

//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "shippingAddressId")
//	private ShippingAddress shippingAddress;
//
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "billingAddressId")
//	private BillingAddress billingAddress;
//
//
	
//
//	public BillingAddress getBillingAddress() {
//		return billingAddress;
//	}
//
//	public void setBillingAddress(BillingAddress billingAddress) {
//		this.billingAddress = billingAddress;
//	}
//


	

//	public ShippingAddress getShippingAddress() {
//		return shippingAddress;
//	}
//
//	public void setShippingAddress(ShippingAddress shippingAddress) {
//		this.shippingAddress = shippingAddress;
//	}

	


}
