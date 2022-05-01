package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.services.Leadservice;

@Controller
public class Leadcontroller {
	
	@Autowired
	private Leadservice leadservice;
	
	@GetMapping("/viewleadspage")
	public String viewleadpage() {
		return "save_lead";
	}
	
	
	
	@PostMapping("/save")
	public String savelead(Lead lead,ModelMap model) {
		leadservice.savelead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	
	@RequestMapping("/listleads")
	public String listallleads(ModelMap model) {
		List<Lead> leads=leadservice.listleads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	
	
	@RequestMapping("/getlead")
	public String getlead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.findleadbyid(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	
	

}
