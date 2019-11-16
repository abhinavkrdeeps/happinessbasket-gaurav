package com.virtusa.happinessbasket.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.dao.BillingDao;
import com.virtusa.happinessbasket.model.BillingAddress;



@Repository
public class BillingServiceImpl implements BillingService {

	@Autowired
	BillingDao dao;

	public void addBillingAddress(BillingAddress address) {
		dao.addBillingAddress(address);

	}
	public boolean delBillingAddress(int addressId) {

		return dao.delBillingAddress(addressId);
	}


}
