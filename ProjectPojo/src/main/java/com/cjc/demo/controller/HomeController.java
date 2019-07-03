package com.cjc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.model.Invoice;
import com.cjc.demo.service.ServiceI;



@RestController
public class HomeController {
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
		
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@RequestBody Invoice iv)
	{
		si.register(iv);
		System.out.println("Registration Successfully !!!");
		return "index";
		
	}
}