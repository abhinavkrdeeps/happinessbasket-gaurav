package com.virtusa.happinessbasket.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.AdminDAOImpl;
import com.virtusa.happinessbasket.dao.CategoryDAOImpl;
import com.virtusa.happinessbasket.dao.ProductDao;
import com.virtusa.happinessbasket.dao.ProductDaoImpl;
import com.virtusa.happinessbasket.model.Admin;
import com.virtusa.happinessbasket.model.Category;
import com.virtusa.happinessbasket.model.Product;
import com.virtusa.happinessbasket.service.AdminService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class AdminController {

	@Autowired
	private AdminDAOImpl dao;
	@Autowired
	private ProductDao pdao;
	@Autowired
	private CategoryDAOImpl catdao;

	
	// ADDING ADMIN
	@RequestMapping(value="add",method=RequestMethod.GET)//address is the url name
	public ModelAndView getAdd() {

		return new ModelAndView("addAdmin","command",new Admin()); // add is the jsp name
	}
	@RequestMapping(value="add", method=RequestMethod.POST)
	public ModelAndView setAdd(@ModelAttribute("Add") Admin admin) {

		dao.add(admin);
		ModelAndView mv = new ModelAndView("successAdmin");
		mv.addObject("Done", "Admin added!");
		return mv;
	}

	
	// ADMIN LOGIN
	@RequestMapping(value="login",method=RequestMethod.GET)
	public ModelAndView Authenticate()
	{
		System.out.println("get");
		return new ModelAndView("login","command",new Admin());


	}
	@RequestMapping(value="home",method=RequestMethod.GET)
	public ModelAndView verfication(@ModelAttribute("login") Admin admin)
	{ 
		boolean var=dao.fetchById(admin);
		



		if(var)
		{
			ModelAndView mav = new ModelAndView("home");
			System.out.println("sdfsf");
			mav.addObject("home",admin.getAid());
			return mav;

		}
		else
		{
			ModelAndView mav = new ModelAndView("home");
			System.out.println("sfgsgsdg");
			mav.addObject("msg","wrong password or userid");
			return mav;
		}
	//	return mav;

	}
	
	
	// FETCH ALL ADMIN
	@RequestMapping(value="getdata",method=RequestMethod.GET)
	public ModelAndView getdata() {
		ModelAndView model=new ModelAndView("AdminList");
		List<Admin> allAdmins=dao.fetchAll();
		model.addObject("lists", allAdmins);
		return model;

	}
	
	// NOT USED TILL NOW
	@RequestMapping(value="update",method=RequestMethod.GET)  //address is the url name
	public ModelAndView getupdcus() {

		return new ModelAndView("update","command",new Admin());  //add is the jsp name
	}
	
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setupdcus(@ModelAttribute Admin admin) {
		if (admin.getAid() == 0) { 
			dao.add(admin);
		} else {
			dao.update(admin);
			System.out.println("updated");
		}
		return new ModelAndView("success");
	}
		
}
