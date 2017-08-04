package com.div.test.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.div.test.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		persist(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		delete(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		update(user);

	}

}
