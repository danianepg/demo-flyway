package com.danianepg.demoflyway.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.danianepg.demoflyway.entities.Person;
import com.danianepg.demoflyway.repositories.PersonRepository;

/**
 * DUMMY CODE!!! This service is an DUMMY example on how to handle a column
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
	public void setName(String name) {
		Person p = new Person();
		p.setName(name);
		p.setFullname(name);
	}

	public String getName(Long id) {
		Optional<Person> p = repository.findById(id);

		if (p.isPresent()) {
			return p.get().getFullname();
		}

		return null;
	}

}
