package com.revature.beans;

import java.util.List;

public interface UserDAO {
	
	public List<User> getAllUsers();
	public User getUserByEmail(String email);
	public User getUserById(int id);
	public void createUser(User u);
	public void updateUser(User u);
	public void removeUser(User u);
	
	
	

}
