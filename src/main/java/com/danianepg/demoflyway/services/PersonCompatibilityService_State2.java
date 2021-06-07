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
public class PersonCompatibilityService_State2 {

	private PersonRepository repository;

	public PersonCompatibilityService_State2(PersonRepository repository) {
		this.repository = repository;
	}

	// State 2 for application and V1_4_0 for database: Code reads from the old
	// column and writes on both
	// V1_4_1 is also executed and data is copied in small shards
	public void save(String name) {
		Person p = new Person();
		p.setName(name);
		p.setFullname(name);
		repository.save(p);
	}

	public String findNameById(Long id) {
		return repository.findById(id)
				.orElseThrow()
				.getName();
	}
}
