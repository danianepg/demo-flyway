package com.danianepg.demoflyway.services;

import org.springframework.stereotype.Service;

import com.danianepg.demoflyway.entities.Person;
import com.danianepg.demoflyway.repositories.PersonRepository;

/**
 * SAMPLE CODE!!! This service is an SAMPLE example on how to handle a column
 * rename migration. It's not suitable for production environments.
 * 
 * @author Daniane
 *
 */
@Service
public class PersonCompatibilityService_State1 {

	private PersonRepository repository;

	public PersonCompatibilityService_State1(PersonRepository repository) {
		this.repository = repository;
	}

	// State 1 for application and V1_1_0 to V1_3_0 for the database
	public void save(String name) {
		Person p = new Person();
		p.setName(name);
		repository.save(p);
	}

	public String findNameById(Long id) {
		return repository.findById(id)
				.orElseThrow()
				.getName();
	}
}
