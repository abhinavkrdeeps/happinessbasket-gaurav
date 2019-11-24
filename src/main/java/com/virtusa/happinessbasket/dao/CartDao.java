package com.virtusa.happinessbasket.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.model.Cart;
import com.virtusa.happinessbasket.model.Product;
import com.virtusa.happinessbasket.model.Customer;

@Repository
public class CartDao {
	
	
	 public void addToCart(Cart cart) {
		 Session session = new Configuration().configure().buildSessionFactory().openSession();
			session.beginTransaction();
		    session.saveOrUpdate(cart);
		    session.getTransaction().commit();	
		    session.close();
	}
	 
	 public void updateCart(Cart cart) {
		 Session session = new Configuration().configure().buildSessionFactory().openSession();
			session.beginTransaction();
		    session.update(cart);
		    session.getTransaction().commit();	
		    session.close();
	}
	
	 public List<Cart> viewCart(int customerId) {
		 Session session = new Configuration().configure().buildSessionFactory().openSession();
			session.beginTransaction();
		    Criteria criteria = session.createCriteria(Cart.class);
		    Criterion criterion = Restrictions.eq("customerId",customerId);
		    criteria.add(criterion);
	        List<Cart> cartlist= criteria.list();
			return cartlist;		
	 }
	  
	 public void removeFromCart(int cartId,int customerId) {
		    Session session = new Configuration().configure().buildSessionFactory().openSession(); 
			session.beginTransaction();
		    session.getTransaction().commit();
		     session.close();	
	 }
	
	
}
