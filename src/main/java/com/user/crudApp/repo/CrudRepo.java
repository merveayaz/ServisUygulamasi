package com.user.crudApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.crudApp.model.User;

public interface CrudRepo extends JpaRepository<User, Integer> {

}
