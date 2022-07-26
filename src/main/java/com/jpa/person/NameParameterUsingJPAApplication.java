package com.jpa.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.person.entities.Person;
import com.jpa.person.service.PersonService;

@SpringBootApplication
public class NameParameterUsingJPAApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(NameParameterUsingJPAApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		createPerson();
		findByLastNameOrFirstName();
		
		
	}
	private void createPerson()
	{
		Person person = new Person("neha","sharma","neha19@gmail.com");
		Person personInfo = personService.createPerson(person);
		System.out.println(personInfo);
	}
	private void findByLastNameOrFirstName()
	{
		List<Person> personList = personService.findByLastNameOrFirstName("shendare","shyam");
		personList.forEach(System.out::println);
		
	}
	
	

}
