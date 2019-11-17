package com.virtusa.happinessbasket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.OrderDaoImpl;
import com.virtusa.happinessbasket.model.DeliveryPerson;
import com.virtusa.happinessbasket.model.Order;

public class OrderController {

	@Autowired
	OrderDaoImpl dao;
	
	@RequestMapping(value="addorder",method=RequestMethod.GET)  //add is the url name
	public ModelAndView getAdd() {
		return new ModelAndView("addOrder","command",new Order());   // adddelguy is the jsp name
	}
		
	@RequestMapping(value="addorder", method=RequestMethod.POST)
	public ModelAndView setAdd(@ModelAttribute("Add") Order order) {
		dao.addOrder(order);
		ModelAndView mv = new ModelAndView("successOrder");
		mv.addObject("Done", "DeliveryPerson is running");
		return mv;
	}
	
	
	@RequestMapping(value="getallorders",method=RequestMethod.GET)  //url mapping
	public ModelAndView getdata() {
		ModelAndView model = new ModelAndView("getallOrders");
		List allOrder=dao.showOrder();
		model.addObject("lists", allOrder);
		return model;

	}
}
