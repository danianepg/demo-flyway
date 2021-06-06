package com.danianepg.demoflyway.services;

import java.util.Optional;

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
public class PersonCompatibilityService_State4 {

	private PersonRepository repository;

	public PersonCompatibilityService_State4(PersonRepository repository) {
		this.repository = repository;
	}

	// State 4 for application and V1_4_0 for database: Code reads and writes from
	// the new column
	public void save(String name) {
		Person p = new Person();
		p.setFullname(name);
		repository.save(p);
	}

	public String findNameById(Long id) {
		Optional<Person> p = repository.findById(id);

		if (p.isPresent()) {
			return p.get().getFullname();
		}

		return null;
	}

}
