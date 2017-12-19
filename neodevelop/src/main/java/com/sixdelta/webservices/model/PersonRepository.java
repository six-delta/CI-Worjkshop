package com.sixdelta.webservices.model;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends Repository<Person, Long> {

	List<Person> findByName(@Param("name") String name);
	
}
