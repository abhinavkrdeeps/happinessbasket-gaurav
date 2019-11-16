package com.virtusa.happinessbasket.service;

import com.virtusa.happinessbasket.model.ShippingAddress;

public interface ShippingService {

	public void addShippingAddress(ShippingAddress address);
	boolean delShippingAddress(int addressId);
	
	
}