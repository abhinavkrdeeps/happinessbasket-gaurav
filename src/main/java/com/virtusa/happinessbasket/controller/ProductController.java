package com.virtusa.happinessbasket.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.ProductDao;
import com.virtusa.happinessbasket.service.ProductServiceImpl;
import com.virtusa.happinessbasket.model.Customer;
import com.virtusa.happinessbasket.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductServiceImpl service;
	
	@Autowired
	ProductDao dao;
	
	
	

	//ADDING A PRODUCT
		@RequestMapping(value="addproduct",method=RequestMethod.GET)//address is the url name
		public ModelAndView getAdd() {
			return new ModelAndView("addproduct","command",new Product()); // add is the jsp name
		}
		@RequestMapping(value="addproduct", method=RequestMethod.POST)
		public ModelAndView setAdd(@ModelAttribute("Addproduct") Product product) {
			dao.addProduct(product);
			ModelAndView mv = new ModelAndView("success");
			mv.addObject("Done", "Achu is running");
			return mv;
		}


		//LIST OF PRODUCT
		@RequestMapping("getproductlist")
		public ModelAndView getproductdata(ModelAndView model) {
			List<Product>  allProduct=dao.getAllProduct();
			model.addObject("lists", allProduct);
			model.setViewName("ProductList");
			return model;

		}

		//FIND BY PRODUCTID
		@RequestMapping(value = "findproduct", method = RequestMethod.GET)
		public ModelAndView getproductid() {
			System.out.println("get");
			return new ModelAndView("findproduct","command",new Product());
		}

		@RequestMapping(value = "findproduct", method = RequestMethod.POST)
		public ModelAndView setemailid(@ModelAttribute("Product")Product product,
				@RequestParam("productId") int productId) {
			System.out.println("productId");
		    Product productById = dao.getProductById(productId);
			System.out.println(productById);
			ModelAndView model = new ModelAndView("Productbyid");
			model.addObject("product", productById);
			return model;
		}


		//DELETE BY PRODUCTID
		@RequestMapping(value = "delproduct", method = RequestMethod.GET)
		public ModelAndView getdelproduct() {
			System.out.println("get");
			return new ModelAndView("deleteproduct","command",new Product());
		}

		@RequestMapping(value = "delproduct", method = RequestMethod.POST)
		public ModelAndView setdelcus(@ModelAttribute("Product")Product product,
				@RequestParam("productId") int productId) {
			System.out.println("productid");
		    Product productById = dao.getProductById(productId);
			dao.deleteProduct(productById);
			ModelAndView mv = new ModelAndView("successDeleteProduct");
			mv.addObject("Done", "Achu is running");
			return mv;

		}


		//UPDATE PRODUCT
		@RequestMapping(value="updateproduct",method=RequestMethod.GET)//address is the url name
		public ModelAndView getupdcus() {
			System.out.println("get");
			return new ModelAndView("updateproduct","command",new Product()); // add is the jsp name
		}


		@RequestMapping(value = "updateproduct", method = RequestMethod.POST)
		public ModelAndView setupdcus(@ModelAttribute("Product")Product product) {
				System.out.println("post");
				dao.updateProduct(product);
				System.out.println("updated");
				ModelAndView mv = new ModelAndView("ProductList");
				mv.addObject("Done", "Achu is running");
				return mv;
			}
			
}
