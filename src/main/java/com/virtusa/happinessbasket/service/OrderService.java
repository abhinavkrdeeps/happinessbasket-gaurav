package com.virtusa.happinessbasket.service;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import com.virtusa.happinessbasket.hibernateiutil.HibernateUtil;
import com.virtusa.happinessbasket.model.Order;


public class OrderService {

	public Order addOrder(Order order) {
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(order);
		session.getTransaction().commit();
		session.close();
		return order;
		
	}
	
public List<Order> showOrder() {
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		TypedQuery query=session.createQuery("from Order");
		List<Order> ordlist= query.getResultList();
		session.close();
		return ordlist;
		
	}

}
