package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {
	List<Users> findByUserId(int userId);
	
	public Users findByUsernameAndUserPass(String username, String userpass);
}