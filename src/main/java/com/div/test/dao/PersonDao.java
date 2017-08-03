package com.div.test.dao;

import java.util.List;

import com.div.test.model.Person;

public interface PersonDao {

	Person findById(int id);
	void savePerson(Person person);
	void deletePersonById(int id);
	List<Person> findAllPersons();
	List<Integer> getPersonIds();
}
