package com.jpa.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.person.dao.PersonDao;
import com.jpa.person.entities.Person;

@Service
public class PersonService {

	@Autowired
	PersonDao personDao;

	public Person createPerson(Person person) {
		
		return personDao.save(person);
	}

	public List<Person> findByLastNameOrFirstName(String lastName, String firstName) {
		return personDao.findByLastNameOrFirstName(lastName,firstName);
	}
	

}
