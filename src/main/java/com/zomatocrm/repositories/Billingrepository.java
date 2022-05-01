package com.zomatocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomatocrm.entities.Billing;

@Repository
public interface Billingrepository extends JpaRepository<Billing, Long> {

}
