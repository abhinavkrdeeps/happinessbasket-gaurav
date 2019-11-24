package com.virtusa.happinessbasket.service;

import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.happinessbasket.dao.OrderDaoImpl;
import com.virtusa.happinessbasket.hibernateiutil.HibernateUtil;
import com.virtusa.happinessbasket.model.Order;

@Service
public class OrderServiceImpl {

	Session session=HibernateUtil.getSession();
	
	OrderDaoImpl orderdao;
	Order order=new Order();
	
	@RequestMapping(value="assignOrder")
	public Order assignOrder() {
		return orderdao.updateOrder(order);
	}
}
