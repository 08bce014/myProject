package com.div.test.dao;

import java.util.List;

import com.div.test.model.User;

public interface UserDao {
	User findById(int id);
	void saveUser(User user);
	void deleteUser(User user);
	List<User> findAllUsers();
	void updateUser(User user);
}
