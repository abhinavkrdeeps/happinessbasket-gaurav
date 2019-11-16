package com.virtusa.happinessbasket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.BillingDao;
import com.virtusa.happinessbasket.model.BillingAddress;
import com.virtusa.happinessbasket.model.ShippingAddress;
import com.virtusa.happinessbasket.service.BillingServiceImpl;

@Controller
public class BillingController {
	
	@Autowired
	BillingServiceImpl service;
	@Autowired
	BillingDao dao;
	//ADD BILLING ADDRESS
		@RequestMapping(value={"savebilling","updatebilling"},method=RequestMethod.GET)//address is the url name
		public ModelAndView getAddBilling() {
			System.out.println("get");
			return new ModelAndView("savebilling","command",new BillingAddress()); // add is the jsp name
		}
		@RequestMapping(value="savebilling", method=RequestMethod.POST)
		public ModelAndView setAddBilling(@ModelAttribute("Add") BillingAddress billingaddress) {
			System.out.println("post");
			service.addBillingAddress(billingaddress);
			ModelAndView mv = new ModelAndView("success");
			mv.addObject("Done", "Achu is running");
			return mv;
		}
		
		
	    //DELETE SHIPPING ADDRESS
		@RequestMapping(value = "delbilling", method = RequestMethod.GET)
		public ModelAndView getdelbilling() {
			System.out.println("get");
			return new ModelAndView("delbilling","command",new BillingAddress());
		}

		@RequestMapping(value = "delbilling", method = RequestMethod.POST)
		public ModelAndView setdelbilling(@ModelAttribute("Billing")BillingAddress billingaddress,
				@RequestParam("addressId") int addressId) {
			System.out.println("addressId");
			dao.delBillingAddress(addressId);
			ModelAndView mv = new ModelAndView("success");
			mv.addObject("Done", "Achu is running");
			return mv;

		}


	

}
