package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Billing;
import com.zomatocrm.entities.Contacts;
import com.zomatocrm.services.Billingservice;
import com.zomatocrm.services.Contactservice;

@Controller
public class Billingcontroller {
	
	@Autowired
	private Contactservice contactservice;
	
	
	@Autowired
	private Billingservice billingservice;
	
     @RequestMapping("/generatebill")
	public String generatebill(@RequestParam("id") long id,ModelMap model) {
    	 Contacts contacts = contactservice.getcontactinfo(id);
    	 model.addAttribute("contacts", contacts);
    	 return "new_bill";
    	 
    	 
		
	}
     
     @RequestMapping("/createbill")
     public String createbill(Billing bill,ModelMap model) {
    	 billingservice.createbill(bill);
    	 List<Billing> bills	 = billingservice.listallbills();
    	 model.addAttribute("bills", bills);
    	 
    	 return "list_billing";
    	 
     }
     
    
     
}
