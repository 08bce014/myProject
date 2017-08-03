package com.div.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.div.test.dao.PersonDao;
import com.div.test.model.Person;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
    private PersonDao dao;
	
	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		dao.savePerson(person);
	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Person> findAllPersons() {
		// TODO Auto-generated method stub
		return dao.findAllPersons();
	}
	
	public List<Integer> getPersonIds() {
		return dao.getPersonIds();
	}

}
