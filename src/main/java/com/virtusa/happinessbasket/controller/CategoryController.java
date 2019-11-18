package com.virtusa.happinessbasket.controller;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.CategoryDAOImpl;
import com.virtusa.happinessbasket.model.Category;
import com.virtusa.happinessbasket.model.Product;

public class CategoryController {

	CategoryDAOImpl dao;
	
			@RequestMapping(value="addcategory",method=RequestMethod.GET)//address is the url name
			public ModelAndView getAdd() {
				return new ModelAndView("addcategory","command",new Category()); // add is the jsp name
			}
			@RequestMapping(value="addcategory", method=RequestMethod.POST)
			public ModelAndView setAdd(@ModelAttribute("Addcategory") Category category) {
				dao.addCategory(category);
				ModelAndView mv = new ModelAndView("successCategory");
				mv.addObject("Done", "Achu is running");
				return mv;
			}


			//LIST OF CATEGORY
			@RequestMapping("getallcategory")
			public ModelAndView getproductdata(ModelAndView model) {
				List<Category>  allcategory=dao.getAllCategory();
				model.addObject("lists", allcategory);
				model.setViewName("CategoryList");
				return model;

			}

			//FIND BY CATEGORYID
			@RequestMapping(value = "findcategory", method = RequestMethod.GET)
			public ModelAndView getproductid() {
				System.out.println("get");
				return new ModelAndView("findCategory","command",new Product());
			}

			@RequestMapping(value = "findcategory", method = RequestMethod.POST)
			public ModelAndView findcategorybyId(@ModelAttribute("Category")Category category,
					@RequestParam("categoryId") int categoryId) {
				System.out.println("categoryId");
			    Category categoryById = dao.getCategoryById(categoryId);
				System.out.println(categoryById);
				ModelAndView model = new ModelAndView("CategorybyId");
				model.addObject("category", categoryById);
				return model;
			}


			//DELETE BY PRODUCTID
			@RequestMapping(value = "delcategory", method = RequestMethod.GET)
			public ModelAndView getdelproduct() {
				System.out.println("get");
				return new ModelAndView("deleteCategory","command",new Product());
			}

			@RequestMapping(value = "delcategory", method = RequestMethod.POST)
			public ModelAndView setdelcus(@ModelAttribute("Category")Category category,
					@RequestParam("categoryId") int categoryId) {
			    Category categoryById = dao.getCategoryById(categoryId);
				dao.deleteCategory(categoryById);
				ModelAndView mv = new ModelAndView("successDeleteCategory");
				mv.addObject("Done", "Category Deleted Successfully");
				return mv;

			}


			//UPDATE CATEGORY
			@RequestMapping(value="updatecategory",method=RequestMethod.GET)//address is the url name
			public ModelAndView getupdcus() {
				System.out.println("get");
				return new ModelAndView("updatecategory","command",new Product()); // add is the jsp name
			}


			@RequestMapping(value = "updatecategory", method = RequestMethod.POST)
			public ModelAndView setupdcus(@ModelAttribute("Category")Category category) {
					dao.updateCategory(category);
					ModelAndView mv = new ModelAndView("CategoryList");
					return mv;
				}

}
