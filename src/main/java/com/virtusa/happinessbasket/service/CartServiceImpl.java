package com.virtusa.happinessbasket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtusa.happinessbasket.dao.CartDao;
import com.virtusa.happinessbasket.model.Cart;


public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDao cartDao;
	
	public void addToCart(int customerId) {
		 cartDao.addToCart(customerId);
	 }
	 public List<Cart> viewCart(int userId) {	
	        List<Cart> cartlist= cartDao.viewCart(userId);	   
			return cartlist;		
	 }
	public void removeFromCart(int cartId, int customerId) {
		cartDao.removeFromCart(cartId, customerId);
		
	}
	 
}