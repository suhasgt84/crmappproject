package com.zomatocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.repositories.Leadrepository;


@Service
public class LeadserviceImpl implements Leadservice {

	@Autowired
	private Leadrepository leadrepo;
	
	
	@Override
	public void savelead(Lead lead) {
            leadrepo.save(lead);
	}


	@Override
	public Lead findleadbyid(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}


	@Override
	public void deletebyid(long id) {
		leadrepo.deleteById(id);
		
	}


	@Override
	public List<Lead> listleads() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}


	
}
