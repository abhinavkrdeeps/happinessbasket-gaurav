package com.virtusa.happinessbasket.dao;

import java.util.List;

import com.virtusa.happinessbasket.model.Customer;


public interface CustomerDao {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);
	
	Customer getCustomerById(int customerId);
	
	Customer updateCustomer(Customer customer);
	
	void deletecustomer(Customer customer);
	
	

}
