package com.mycompany.mayapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hellomvc")
public class HelloSpringMvcController {

	@RequestMapping( method = RequestMethod.GET)
	public String ourWebMethod(ModelMap model) {
		System.out.println("inside our web method");
		model.addAttribute("jundaIsAGoodBoy", "Hello Spring MVC and today is your lucky day");
		return "helloMvc";
	}

}
