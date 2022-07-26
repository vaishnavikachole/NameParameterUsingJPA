package com.jpa.person.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.person.entities.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer>
{
    @Query("select p from Person p where p.firstName=:firstname Or p.lastName=:lastname")
	List<Person> findByLastNameOrFirstName(@Param("lastname") String lastName, @Param("firstname") String firstName);

}
