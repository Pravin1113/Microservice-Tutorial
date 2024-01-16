package com.pravin.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravin.db2.entity.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	
}
