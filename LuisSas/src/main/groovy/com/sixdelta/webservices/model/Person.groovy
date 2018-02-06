package com.sixdelta.webservices.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id
	String name
	int age
	
}
