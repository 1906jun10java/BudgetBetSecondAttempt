package com.revature.service;

import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.User;


public class LoginService {

	public LoginService() {
		
	}
	public User authenticateUser(Credentials creds) {
		System.out.println("3 - running authenticateUser from AuthenticateUser");
		UserService us = new UserService();
		User user = null;
		List<User> currentUsers = us.getAllUsers();
		int i = 0;
		for (User u : currentUsers) {
			if (currentUsers.get(i).getEmail().equals(creds.getEmail()) ) {
				if (u.getPassword().equals(creds.getPassword())) {
					return user;
				}

			}
		}
		return null;
	}

	
	

}
