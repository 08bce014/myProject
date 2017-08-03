package com.div.test.service;

import java.util.List;

import com.div.test.model.Person;

public interface PersonService {
	 
    Person findById(int id);
     
    void savePerson(Person Person);
     
    void updatePerson(Person Person);
     
    void deletePersonById(int id);
 
    List<Person> findAllPersons(); 
    
    List<Integer> getPersonIds();
     
}