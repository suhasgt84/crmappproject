package com.zomatocrm.services;

import java.util.List;

import com.zomatocrm.entities.Billing;

public interface Billingservice {

	public void createbill(Billing bill);

	public List<Billing> listallbills();
}
