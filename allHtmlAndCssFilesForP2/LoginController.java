package com.revature.controller;

import java.io.StringReader;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.User;
import com.revature.service.LoginService;
import com.revature.service.UserService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

	private LoginService ls;
	private UserService us;
	private ObjectMapper om;

	@Autowired
	public LoginController(LoginService ls, UserService us) {
		this.ls = ls;
		this.us = us;
	}

	// Get all the users
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(us.allUsers(), HttpStatus.OK);
	}

	@RequestMapping(value="id/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> getUserById(@PathVariable int id){
		ResponseEntity<String> resp =  null;
		try {
			us.userById(id);
			resp = new ResponseEntity<>("Grabbed User By ID", HttpStatus.OK);
		}catch(Exception e) {
			resp =  new ResponseEntity<>("Failed to get the id", HttpStatus.BAD_REQUEST);
					
					}
		return resp;
	}

	// Login
	@PostMapping
	public ResponseEntity<User> login(@RequestBody String rawJson) {
		ResponseEntity<User> resp = null;
		JsonReader jr = Json.createReader(new StringReader(rawJson));
		JsonObject Obj = jr.readObject();
		jr.close();
		String email = Obj.getString("email");
		String password = Obj.getString("password");
		User u = null;
		try {
			u = ls.authenticateUser(email, password);
			resp = new ResponseEntity<>(u, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

}
