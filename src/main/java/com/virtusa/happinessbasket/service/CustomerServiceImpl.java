package com.virtusa.happinessbasket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.dao.CustomerDaoImpl;
import com.virtusa.happinessbasket.model.Customer;




@Repository
public class CustomerServiceImpl{
	
	@Autowired
	CustomerDaoImpl dao;
	
	public Customer validateCustomer(String email,String password)
	{
		System.out.println("email "+ email);
		Customer customer = dao.getCustomerByemailId(email);
		if(customer!=null)
		{
			if(customer.getCuspassword().equals(password))
			{
				return customer;
			}
		}
		return null;
		
	}
	

}
