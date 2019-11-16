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

import com.virtusa.happinessbasket.model.Cart;
import com.virtusa.happinessbasket.model.Product;


public class CartDao {
	

	Cart cart=new Cart();
	ProductDaoImpl productDao=new ProductDaoImpl();
	
	 public void addToCart(int customerId) {
		 Session session = new Configuration().addAnnotatedClass(Cart.class).configure().buildSessionFactory().openSession();

			session.beginTransaction();
			System.out.println(customerId);
		    cart.setCustomerId(customerId);
		    cart.setQuantity(3);
		    session.save(cart);
		    session.getTransaction().commit();	
		    }
	
	 public List<Cart> viewCart(int customerId) {
		 Session session = new Configuration().addAnnotatedClass(Cart.class).configure().buildSessionFactory().openSession();

			session.beginTransaction();
		    Criteria criteria = session.createCriteria(Cart.class);
		    Criterion criterion = Restrictions.eq("customerId",customerId);
		    criteria.add(criterion);
	        List<Cart> cartlist= criteria.list();
		    session.getTransaction().commit();
			return cartlist;		
	 }
	  
	 public void removeFromCart(int cartId,int customerId) {
		 Session session = new Configuration().addAnnotatedClass(Product.class).configure().buildSessionFactory().openSession();

			session.beginTransaction();
		    Cart cart=session.load(Cart.class, cartId);
		    session.delete(cart);
		    session.getTransaction().commit();
		     session.close();	
	 }
	 public static void main(String[] args) {
		 CartDao dao= new CartDao();
		int customerId=4;
		int cartId=5;
		dao.removeFromCart(cartId, customerId);
		 System.out.println("done");
		
	}
	
}
