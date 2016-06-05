package com.srm.workshop.tradeplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {
	
	public MainController(){
		//Default constructor
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getHomePage(final ModelMap model){
		return new ModelAndView("index");
	}

}
