package com.zomatocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zomatocrm.entities.Contacts;

public interface Contactrepository extends JpaRepository<Contacts, Long> {

}
