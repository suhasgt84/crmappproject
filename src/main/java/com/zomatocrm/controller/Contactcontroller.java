package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Contacts;
import com.zomatocrm.entities.Lead;
import com.zomatocrm.services.Contactservice;
import com.zomatocrm.services.Leadservice;

@Controller
public class Contactcontroller {
	
	@Autowired
	private Leadservice leadservice;
	
	
	@Autowired
	private Contactservice contactservice;
	
	@RequestMapping("/savecontact")
	public String savecontact(@RequestParam("id") long id,ModelMap modelmap) {
		Lead lead=leadservice.findleadbyid(id);
		Contacts contact=new Contacts(lead.getFirstName(),lead.getLastName(),lead.getEmail(),lead.getMobile(),lead.getLeadSource());
		contactservice.Savecontactinfo(contact);
		leadservice.deletebyid(id);
		
		List<Contacts> contacts = contactservice.listcontacts();
		modelmap.addAttribute("contacts",contacts);
		return "list_contacts";
		
		

	}

	@RequestMapping("/listcontacts")
	public String listallleads(ModelMap model) {
		List<Contacts> contacts=contactservice.listcontacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	
	
}
