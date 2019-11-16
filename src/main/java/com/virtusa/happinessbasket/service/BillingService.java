package com.virtusa.happinessbasket.service;

import com.virtusa.happinessbasket.model.BillingAddress;
import com.virtusa.happinessbasket.model.ShippingAddress;

public interface BillingService {
	public void addBillingAddress(BillingAddress address);
	boolean delBillingAddress(int addressId);

}
