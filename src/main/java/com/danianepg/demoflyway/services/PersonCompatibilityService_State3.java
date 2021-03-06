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
public class PersonCompatibilityService_State3 {

	private PersonRepository repository;

	public PersonCompatibilityService_State3(PersonRepository repository) {
		this.repository = repository;
	}

	// State 3 for application and V1_4_0 for database: Code reads from the new
	// column and writes on both
	public void save(String name) {
		Person p = new Person();
		p.setName(name);
		p.setFullname(name);
		repository.save(p);
	}

	public String findNameById(Long id) {
		return repository.findById(id)
				.orElseThrow()
				.getFullname();
	}

}
