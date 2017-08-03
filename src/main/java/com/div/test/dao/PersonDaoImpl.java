package com.div.test.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.div.test.model.Person;

@Repository("personDao")
@Transactional
public class PersonDaoImpl extends AbstractDao<Integer, Person> implements PersonDao{

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		persist(person);
	}

	@Override
	public void deletePersonById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> findAllPersons() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
        return (List<Person>) criteria.list();
	}

	public List<Integer> getPersonIds() {
		Criteria criteria = createEntityCriteria();
		criteria.setProjection(Projections.projectionList().add(Projections.property("id")));
		List<Integer> personIds = criteria.list();
		return personIds;
	}
}
