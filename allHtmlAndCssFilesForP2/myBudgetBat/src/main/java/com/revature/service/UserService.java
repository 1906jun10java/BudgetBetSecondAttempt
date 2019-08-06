package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.beans.User;
import com.revature.beans.UserDAO;

public class UserService {

	public static ArrayList<String> UsersIndex = new ArrayList<>();

	private UserDAO userDao;

	@Autowired
	public UserService(UserDAO userDao) {
		this.userDao = userDao;
	}

	public UserService() {
	}

	public List<User> getAllUsers() {
		return this.userDao.getAllUsers();

	}

	public User getUserByEmail(String email) {
		return this.userDao.getUserByEmail(email);

	}

	public void createUser(User user) {
		userDao.createUser(user);
	}

}
