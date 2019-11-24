package com.virtusa.happinessbasket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.happinessbasket.dao.DeliveryPersonDaoImpl;
import com.virtusa.happinessbasket.model.DeliveryPerson;



@Controller
public class DeliveryPersonController {
	@Autowired
	private DeliveryPersonDaoImpl dao;


	@RequestMapping(value="adddel",method=RequestMethod.GET)  //add is the url name
	public ModelAndView getAdd() {
		return new ModelAndView("adddelper","command",new DeliveryPerson());   // adddelguy is the jsp name
	}
		
	@RequestMapping(value="adddel", method=RequestMethod.POST)
	public ModelAndView setAdd(@ModelAttribute("Add") DeliveryPerson deliveryperson) {
		dao.addDeliveryPerson(deliveryperson);
		
		ModelAndView mv = new ModelAndView("successDel");
		mv.addObject("Done", "DeliveryPerson is running");
		return mv;
	}
	
	
	@RequestMapping(value="getdel",method=RequestMethod.GET)  //url mapping
	public ModelAndView getdata() {
		ModelAndView model = new ModelAndView("DelPerList");
		List<DeliveryPerson> allDeliveryperson=dao.getAllDeliveryPerson();
		System.out.println(allDeliveryperson);
		model.addObject("lists", allDeliveryperson);
		return model;

	}
	@RequestMapping(value="homeDelper")
	public ModelAndView home() {
		return new ModelAndView("DeliveryDashboard");
	}
	
	
	@RequestMapping(value="deletedel/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable("id")String id)
	{
		DeliveryPerson deliveryPerson = dao.getDeliveryPersonById(Integer.parseInt(id));
		dao.deleteADeliveryPerson(deliveryPerson);
		return "redirect:/getdel";
	}
		
	@RequestMapping(value="updatedel/{id}",method=RequestMethod.GET)
	public ModelAndView update(@RequestParam("id")String id)
	{
		DeliveryPerson deliveryPerson = dao.getDeliveryPersonById(Integer.parseInt(id));
		return new ModelAndView("updatedelper","command",deliveryPerson);
	}
		
	@RequestMapping(value="updatedel/{id}",method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("del")DeliveryPerson deliveryPerson,@RequestParam("id")String id)
	{
		dao.updateDeliveryPerson(deliveryPerson);
		ModelAndView model = new ModelAndView("DelPerList");
		List allDeliveryperson=dao.getAllDeliveryPerson();
		model.addObject("lists", allDeliveryperson);
		return model;
	}
}
