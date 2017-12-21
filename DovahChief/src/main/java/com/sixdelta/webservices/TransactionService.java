package com.sixdelta.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdelta.webservices.repository.PersonRepository;

@Service
public class TransactionService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public void executeTransaction(){
		personRepository.findOne(1l);
		//personRepository.save(new Person());
	}
}
