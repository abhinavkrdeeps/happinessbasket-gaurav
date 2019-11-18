package com.virtusa.happinessbasket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.dao.CustomerDaoImpl;
import com.virtusa.happinessbasket.model.Customer;




@Repository
public class CustomerServiceImpl{
	
	@Autowired
	CustomerDaoImpl dao;
	
	
	private Customer customer;

	public boolean checkLogin(String emailId,String password)
	{
		customer=dao.getCustomerByemailId(emailId);
		System.out.println(password);
		System.out.println(customer);
		if(customer.getCuspassword().equals(password))
		{
			System.out.println("inside");
			return true;
		}
		else
		return false;
		
	}
	

}
