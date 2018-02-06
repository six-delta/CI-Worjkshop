package com.sixdelta.webservices.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people", exported = true)
public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findByName(@Param("name") String name);
	
}
