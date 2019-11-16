package com.virtusa.happinessbasket.service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.dao.ShippingDao;
import com.virtusa.happinessbasket.model.ShippingAddress;


@Repository
public class ShippingServiceImpl implements ShippingService {
	@Autowired
	ShippingDao shippingDao;
	
public void addShippingAddress(ShippingAddress address) {
		
	   shippingDao.addShippingAddress(address);
}

public boolean delShippingAddress(int addressId) {
	
	return shippingDao.delShippingAddress(addressId);
}

}
