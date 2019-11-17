package com.virtusa.happinessbasket.dao;

import java.util.List;

import com.virtusa.happinessbasket.model.Order;

public interface OrderDao {

	public Order addOrder(Order order);
	public List<Order> showOrder(); 
}
