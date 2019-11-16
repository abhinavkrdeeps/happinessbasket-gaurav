package com.virtusa.happinessbasket.service;

import java.util.List;

import com.virtusa.happinessbasket.model.Cart;


public interface CartService {
	 public void addToCart(int userId);
	 public List<Cart> viewCart(int userId);
	 public void removeFromCart(int cartId,int userId);
	 
}