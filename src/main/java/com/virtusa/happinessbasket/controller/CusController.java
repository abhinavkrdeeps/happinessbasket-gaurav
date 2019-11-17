package com.virtusa.happinessbasket.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.CustomerDaoImpl;
import com.virtusa.happinessbasket.service.CustomerServiceImpl;
import com.virtusa.happinessbasket.model.Customer;

@Controller
public class CusController {
	@Autowired
	private CustomerDaoImpl dao;
	@Autowired
	private CustomerServiceImpl service;




	//ADDING A CUSTOMER
	@RequestMapping(value="addcus",method=RequestMethod.GET)
	public ModelAndView getAdd() {
		return new ModelAndView("addCus","command",new Customer()); 
	}
	@RequestMapping(value="addcus", method=RequestMethod.POST)
	public ModelAndView setAdd(@ModelAttribute("Add") Customer customer) {
		dao.addCustomer(customer);
		ModelAndView mv = new ModelAndView("successCus");
		mv.addObject("Done", "Customer Added!");
		return mv;
	}


	//CUSTOMER LIST
	@RequestMapping("getCus")
	public ModelAndView getdata(ModelAndView model) {
		List<Customer>  allCustomers=dao.getAllCustomers();
		model.addObject("lists", allCustomers);
		model.setViewName("cuslist");
		return model;

	}

	//FIND BY CUSTOMER MAILID
	@RequestMapping(value = "findcus", method = RequestMethod.GET)
	public ModelAndView getemailid() {
		System.out.println("get");
		return new ModelAndView("findcus","command",new Customer());
	}

	@RequestMapping(value = "findcus", method = RequestMethod.POST)
	public ModelAndView setemailid(@ModelAttribute("Customer")Customer customer,
			@RequestParam("emailId") String emailId) {
		System.out.println("emailid");
		Customer customerByemailId = dao.getCustomerByemailId(emailId);
		System.out.println(customerByemailId);
		ModelAndView model = new ModelAndView("cusbyid");
		model.addObject("customer", customerByemailId);
		return model;
	}


	//DELETE BY CUSTOMER MAILID
	@RequestMapping(value = "delcus", method = RequestMethod.GET)
	public ModelAndView getdelcus() {
		System.out.println("get");
		return new ModelAndView("deletecus","command",new Customer());
	}

	@RequestMapping(value = "delcus", method = RequestMethod.POST)
	public ModelAndView setdelcus(@ModelAttribute("Customer")Customer customer,
			@RequestParam("emailId") String emailId) {
		System.out.println("emailid");
		Customer customerByemailId = dao.getCustomerByemailId(emailId);
		dao.deletecustomer(customerByemailId);
		System.out.println(customerByemailId);
		ModelAndView mv = new ModelAndView("successDeleteCus");
		mv.addObject("Done", "Achu is running");
		return mv;

	}


	//UPDATE CUSTOMER
	@RequestMapping(value="updatecus",method=RequestMethod.GET)
	public ModelAndView getupdcus() {
		System.out.println("get");
		return new ModelAndView("updatecus","command",new Customer());
	}


	@RequestMapping(value = "updatecus", method = RequestMethod.POST)
	public ModelAndView setupdcus(@ModelAttribute Customer customer) {
		if (customer.getCustomerId() == 0) { 
			dao.addCustomer(customer);
		} else {
			System.out.println("post");
			dao.updateCustomer(customer);
			System.out.println("updated");
			ModelAndView mv = new ModelAndView("successCus");
			mv.addObject("Done", "Achu is running");
			return mv;
		}
		return new ModelAndView("add");
	}


	//GET BY CUSTOMER ID
	@RequestMapping(value = "getcusid", method = RequestMethod.GET)
	public ModelAndView getcustid() {
		System.out.println("get");
		return new ModelAndView("getcusid","command",new Customer());
	}

	@RequestMapping(value = "getcusid", method = RequestMethod.POST)
	public ModelAndView setcustid(HttpServletRequest request) {
		System.out.println("post");
		int customerId=Integer.parseInt(request.getParameter("customerId"));
		System.out.println(customerId);
		Customer customerById = dao.getCustomerById(customerId);
		System.out.println(customerById);	   
		ModelAndView model = new ModelAndView("resultcusid");		        
		model.addObject("customer", customerById);
		return model;
	}
	
	
	//LOGIN CHECKING
	@RequestMapping(value="loginCus",method=RequestMethod.GET)
	public ModelAndView Authenticate()
	{
		System.out.println("get");
		return new ModelAndView("login","command",new Customer());


	}
	@RequestMapping(value="homecus",method=RequestMethod.POST)
	public ModelAndView verfication(@ModelAttribute("Customer")Customer customer,
			@RequestParam("emailId") String emailId,
			@RequestParam("password")String password)
	{
		System.out.println(emailId);
		System.out.println(password);
		boolean checkLogin = service.checkLogin(emailId, password);
		if(checkLogin)
		{
			ModelAndView mav = new ModelAndView("customerhome");					
			mav.addObject("home",emailId);
			return mav;

		}
		else
		{ 
			ModelAndView mv = new ModelAndView("login");
			return mv;

		}



	}







	//ALTERNATIVE TRIED PARTS

	/* @RequestMapping(value = "findcus", method = RequestMethod.POST)
		    public ModelAndView setemailid(HttpServletRequest request) {
			 System.out.println("post");
			 String emailid=request.getParameter("emailId");
			 System.out.println(emailid);
		        Customer customerByemailId = dao.getCustomerByemailId(emailid);
		        System.out.println(customerByemailId);

		        ModelAndView model = new ModelAndView("resultfind");

		        model.addObject("customer", customerByemailId);

		        return model;
		    }*/


	/*@RequestMapping(value="home",method=RequestMethod.POST)
			public ModelAndView verfication(HttpServletRequest request)
			{ 
				String emailId = request.getParameter("emailId");
				String password = request.getParameter("password");
				System.out.println(emailId);
				System.out.println(password);

			   boolean checkLogin = service.checkLogin(emailId, password);
				if(checkLogin)
				{
					System.out.println("sdfsf");
					ModelAndView mav = new ModelAndView("customerhome");					
					mav.addObject("home",emailId);
					return mav;

				}
				else
				{

					System.out.println("sfgsgsdg");
					ModelAndView mv = new ModelAndView("login");
//					mav.addObject("msg","wrong password or userid");
					return mv;

				}


//				int customerid=request.getParameter("customerid");
//				System.out.println("post");
//				System.out.println("sam");
//				dao.getCustomerById(customerId);
//				boolean var=//fetchById(admin);
//				ModelAndView mav = new ModelAndView("home");



//				if(var)
//				{
//					System.out.println("sdfsf");
//					mav.addObject("home",customer.getAid());
//
//				}
//				else
//				{
//					System.out.println("sfgsgsdg");
//					mav.addObject("msg","wrong password or userid");
//				}
//				return mav;

			}*/







}
