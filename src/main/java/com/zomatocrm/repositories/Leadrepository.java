package com.zomatocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomatocrm.entities.Lead;

@Repository
public interface Leadrepository extends JpaRepository<Lead, Long> {

}
