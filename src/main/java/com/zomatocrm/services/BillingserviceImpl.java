package com.zomatocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Billing;
import com.zomatocrm.repositories.Billingrepository;

@Service
public class BillingserviceImpl implements Billingservice {

	@Autowired
	private Billingrepository billingrepo;
	
	@Override
	public void createbill(Billing bill) {
		billingrepo.save(bill);

	}

	@Override
	public List<Billing> listallbills() {
     List<Billing> bills = billingrepo.findAll();
     return bills;
		
	}

}
