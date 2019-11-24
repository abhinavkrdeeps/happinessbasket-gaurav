package com.virtusa.happinessbasket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.OrderDaoImpl;
import com.virtusa.happinessbasket.dao.ProductDao;
import com.virtusa.happinessbasket.model.DeliveryPerson;
import com.virtusa.happinessbasket.model.Order;
import com.virtusa.happinessbasket.model.Product;

public class OrderController {

	@Autowired
	OrderDaoImpl dao;
	
	@Autowired
	ProductDao pdao;
	
	@RequestMapping(value="addorder",method=RequestMethod.GET)  //add is the url name
	public ModelAndView getAdd() {
		return new ModelAndView("addOrder","command",new Order());   // adddelguy is the jsp name
	}
		
	@RequestMapping(value="addorder", method=RequestMethod.POST)
	public ModelAndView setAdd(@ModelAttribute("Add") Order order) {
		dao.addOrder(order);
		ModelAndView mv = new ModelAndView("successOrder");
		return mv;
	}
	
	
	@RequestMapping(value="getallorders",method=RequestMethod.GET)  //url mapping
	public ModelAndView getdata() {
		ModelAndView model = new ModelAndView("OrderList");
		List<Order> allOrder=dao.showOrder();
		model.addObject("lists", allOrder);
		return model;

	}
	
	@RequestMapping(value="assignorder",method=RequestMethod.GET)
	public ModelAndView assignorder() {
		ModelAndView mv= new ModelAndView("OrderList");
		return null;
		
	}
	
	@RequestMapping(value="assignorder",method=RequestMethod.POST)
	public String assignorder(DeliveryPerson deliveryperson,Order order) {
		order.setDeliveryperson(deliveryperson);
		dao.updateOrder(order);
		List<Product>  allProduct=pdao.getAllProduct();
		ModelAndView mv=new ModelAndView();
		mv.addObject("lists","allProduct");
		return "redirect:OrderList";
		
	}
}
