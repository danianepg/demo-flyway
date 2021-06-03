package com.danianepg.demoflyway.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.danianepg.demoflyway.entities.Person;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
