package com.user.crudApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.crudApp.model.User;
import com.user.crudApp.services.CrudService;

@RestController
public class CrudRestController {
	@Autowired
	private CrudService service;
	
	
	@GetMapping("/getuserlist")
	public List<User> fetchUserList() {
		List<User> users = new ArrayList<User>();
		//Database'den veri getirme 
		users = service.fetchUserList();
		return users;
	}
	
	@PostMapping("/adduser")
	public User saveUser(@RequestBody User user) {
		return service.saveUserToDB(user);
	}
	
}
