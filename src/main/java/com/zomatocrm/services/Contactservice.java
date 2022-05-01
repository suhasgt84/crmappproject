package com.zomatocrm.services;

import java.util.List;

import com.zomatocrm.entities.Contacts;

public interface Contactservice {
	public void Savecontactinfo(Contacts contacts);

	public List<Contacts> listcontacts();

	public Contacts getcontactinfo(long id);

}
