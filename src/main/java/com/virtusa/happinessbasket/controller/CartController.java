package com.virtusa.happinessbasket.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtusa.happinessbasket.dao.CartDao;
import com.virtusa.happinessbasket.dao.CustomerDaoImpl;
import com.virtusa.happinessbasket.dao.ProductDaoImpl;
import com.virtusa.happinessbasket.model.Cart;
import com.virtusa.happinessbasket.model.Customer;
import com.virtusa.happinessbasket.model.Product;

@Controller
public class CartController {

	@Autowired
	ProductDaoImpl pdao;
	@Autowired
	CustomerDaoImpl cdao;
	@Autowired
	CartDao cartdao;
	
	
	@RequestMapping(value="addtocart/{productId}", method=RequestMethod.GET)
	public String addtoCart(@PathVariable("productId") String productId,HttpSession session) {
		Product product=pdao.getProductById(Integer.parseInt(productId));
		Customer customer=(Customer)session.getAttribute("customer");
		Cart cart=customer.getCart();
		System.out.println("1");
		if(cart==null)
		{
			System.out.println("21");
			cart = new Cart();
			System.out.println("22");
			cart.setCustomer(customer);
			System.out.println("23");
			List<Product> products = new ArrayList<Product>();
			System.out.println("24");
			products.add(product);
			System.out.println("25");
			cart.setProduct(products);
			System.out.println("26");
			cartdao.addToCart(cart);
			System.out.println("27");
			customer.setCart(cart);
			System.out.println("2");
		}else {
			List<Product> plist=cart.getProduct(); 
			if(plist==null)
			{
				System.out.println("31");
				plist = new ArrayList<Product>();
				
				plist.add(product);
				System.out.println("32");
				cart.setProduct(plist);
				System.out.println("33");
				cartdao.addToCart(cart);
				System.out.println("34");
				customer.setCart(cart);
				System.out.println("35");
			}else {
				System.out.println("40");

				plist.add(product);
				System.out.println("41");

				cart.setProduct(plist);
				System.out.println("42");

				cartdao.addToCart(cart);
				System.out.println("43");

				customer.setCart(cart);
				System.out.println("44");
			}
		}
		
		cdao.updateCustomer(customer);

	    return "redirect:/cuscart";
	}
	
	@RequestMapping(value="removefromcart")
	public String removefromCart(int productId,int customerId) {
		Product product=pdao.getProductById(productId);
		Customer customer=cdao.getCustomerById(customerId);
		Cart cart=customer.getCart();
		List<Product> plist=cart.getProduct();
		plist.add(product);
		cart.setProduct(plist);
		cartdao.addToCart(cart);
	    return "redirect:OrderList";
	}
	
}
