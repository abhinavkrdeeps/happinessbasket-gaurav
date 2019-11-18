package com.virtusa.happinessbasket.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.virtusa.happinessbasket.model.Customer;
import com.virtusa.happinessbasket.model.Payment;
import com.virtusa.happinessbasket.model.ShippingAddress;
import com.virtusa.happinessbasket.service.ShippingServiceImpl;



@Controller
public class ShippingController {
//	@Autowired
//	Payment payment;
//	
	@Autowired
	ShippingServiceImpl shippingService;
//	
//	@RequestMapping("/saveShipping")
//	public ModelAndView saveShippingAddress(ShippingAddress shippingAddress,HttpSession session){  
//		System.out.println(shippingAddress);	
//		//System.out.println(session.getAttribute("cartForm"));
//		
//    	shippingService.addShippingAddress(shippingAddress);		
//        return new ModelAndView("addpayment","command",payment);  
//    }
	//ADD SHIPPING ADDRESS
	@RequestMapping(value="saveshipping",method=RequestMethod.GET)//address is the url name
	public ModelAndView getAddshippping() {
		System.out.println("get");
		return new ModelAndView("saveshipping","command",new ShippingAddress()); // add is the jsp name
	}
	@RequestMapping(value="updateshipping",method=RequestMethod.GET)//address is the url name
	public ModelAndView getUpdateshippping() {
		System.out.println("get");
		return new ModelAndView("updateshipping","command",new ShippingAddress()); // add is the jsp name
	}
	@RequestMapping(value="saveshipping", method=RequestMethod.POST)
	public ModelAndView setAddshipping(@ModelAttribute("Add") ShippingAddress shippingaddress) {
		System.out.println("post");
		shippingService.addShippingAddress(shippingaddress);
		ModelAndView mv = new ModelAndView("successShipping");
		mv.addObject("Done", "Achu is running");
		return mv;
	}
	
	
    //DELETE SHIPPING ADDRESS
	@RequestMapping(value = "delshipping", method = RequestMethod.GET)
	public ModelAndView getdelshipping() {
		System.out.println("get");
		return new ModelAndView("deleteshipping","command",new ShippingAddress());
	}

	@RequestMapping(value = "delshipping", method = RequestMethod.POST)
	public ModelAndView setdelshipping(@ModelAttribute("Shipping")ShippingAddress shippingAddress,
			@RequestParam("addressId") int addressId) {
		System.out.println("addressId");
		boolean delShippingAddress = shippingService.delShippingAddress(addressId);
		ModelAndView mv = new ModelAndView("ShippingList");
		mv.addObject("Done", "Achu is running");
		return mv;

	}


}
