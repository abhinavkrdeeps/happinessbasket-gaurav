package com.virtusa.happinessbasket.dao;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import com.virtusa.happinessbasket.hibernateiutil.HibernateUtil;
import com.virtusa.happinessbasket.model.Order;


public class OrderDaoImpl implements OrderDao{

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
		TypedQuery<Order> query=session.createQuery("from Order");
		List<Order> ordlist= query.getResultList();
		session.close();
		return ordlist;

	}

	public Order updateOrder(Order order) {
		Session session=HibernateUtil.getSession();
		session.beginTransaction();
		TypedQuery query= session.createQuery("update Order set status = :status");
		query.setParameter("status", "Completed");
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		return order;
	}
}
