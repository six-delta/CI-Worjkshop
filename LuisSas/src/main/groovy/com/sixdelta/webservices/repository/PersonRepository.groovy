package com.sixdelta.webservices.repository

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

import com.sixdelta.webservices.model.Person

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	List<Person> findByName(@Param("name") String name)
	
}
