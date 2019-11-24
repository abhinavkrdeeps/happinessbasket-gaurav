package com.virtusa.happinessbasket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtusa.happinessbasket.dao.CartDao;
import com.virtusa.happinessbasket.model.Cart;
import com.virtusa.happinessbasket.model.Customer;


public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDao cartDao;
	
	
	 public List<Cart> viewCart(int userId) {	
	        List<Cart> cartlist= cartDao.viewCart(userId);	   
			return cartlist;		
	 }
	public void removeFromCart(int cartId, int customerId) {
		cartDao.removeFromCart(cartId, customerId);
		
	}
	public void addToCart(int userId) {
		// TODO Auto-generated method stub
		
	}
	 
}