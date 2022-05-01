package com.zomatocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.utilities.Emailservice;

@Controller
public class Emailcontroller {
	
	@Autowired
	private Emailservice emailservice;
	
	@RequestMapping("/compose")
	public String getemailid(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("email",email);
		return "compose_email";
	}
	
	
	@RequestMapping("/sendemail")
	public String sendemail(@RequestParam("email") String email,@RequestParam("sub") String sub,@RequestParam("message") String message,ModelMap model) {
		emailservice.sendSimpleMessage(email, sub, message);
		model.addAttribute("msg", "Email sent!");
		return "compose_email";
 		
	}
}
