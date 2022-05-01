package com.zomatocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Contacts;
import com.zomatocrm.repositories.Contactrepository;

@Service
public class ContactserviceImpl implements Contactservice {
	
	@Autowired
	private Contactrepository contactrepo;

	@Override
	public void Savecontactinfo(Contacts contacts) {
      contactrepo.save(contacts);
	}

	@Override
	public List<Contacts> listcontacts() {
		List<Contacts> contacts = contactrepo.findAll();
		
		return contacts;
	}

	@Override
	public Contacts getcontactinfo(long id) {
		Optional<Contacts> findById = contactrepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
		
	}

}
