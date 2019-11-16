package com.virtusa.happinessbasket.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.model.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao {


	public void addCustomer(Customer customer) {
		Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}



	public List<Customer> getAllCustomers() {
		Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		List<Customer> customerList = session.createQuery("from Customer").list();
		session.getTransaction().commit();

		return customerList;
	}



	public Customer getCustomerByemailId(String emailid) {

		Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		System.out.println(emailid);
		Query q =  session.createQuery("from Customer where emailId=:emailid");
		q.setParameter("emailid", emailid);
		Customer customer = (Customer)q.uniqueResult();
		session.getTransaction().commit();

		return customer;
	}



	public Customer updateCustomer(Customer customer) {
		Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.update(customer);
		session.getTransaction().commit();		
		return customer;
	}



	public Customer getCustomerById(int customerId) {
		Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		Query q =  session.createQuery("from Customer where customerId=:customerId");
		q.setParameter("customerId", customerId);
		Customer customer = (Customer)q.uniqueResult();
		session.getTransaction().commit();
		return customer;
	}



	public void deletecustomer(Customer customer) {
		Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.delete(customer);
		session.getTransaction().commit();
		session.close();
	}
}




