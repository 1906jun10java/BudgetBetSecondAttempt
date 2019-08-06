package com.revature.dao;

import java.util.List;

import com.revature.beans.User;

public interface UserDAO {
	
	public List<User> getAllUsers();
	public User getUserByEmail(String email);
	public User getUserById(int id);
	public void createUser(User u);
	public void updateUser(User u);
	public void removeUser(User u);
	
	
	

}
