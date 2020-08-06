package com.user.crudApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.crudApp.model.User;
import com.user.crudApp.repo.CrudRepo;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	
	public  List<User> fetchUserList() {
		return repo.findAll();
	}
	
	public User saveUserToDB(User user) 
	{
		return repo.save(user);
	}
	
	public Optional<User> fetchUserById(int id)
	{
		return repo.findById(id);
	}
	
	public String deleteUserById(int id)
	{
		String result;
		try {
			repo.deleteById(id);
			result = "User deleted succesfully";
			
		} catch (Exception e) {
			result = "User with id is not deleted";
			// TODO: handle exception
		}
		return result;
	}
}
