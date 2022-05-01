package com.zomatocrm.services;

import java.util.List;

import com.zomatocrm.entities.Lead;

public interface Leadservice {
	public void savelead(Lead lead);

	public Lead findleadbyid(long id);

	public void deletebyid(long id);

	public List<Lead> listleads();



}
