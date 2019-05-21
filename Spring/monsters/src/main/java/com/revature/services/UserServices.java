package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.CredentialDto;
import com.revature.model.Users;
import com.revature.repositories.UserRepo;

@Service
public class UserServices {

	@Autowired
	private UserRepo userRepo;
	
	public Users login(CredentialDto user) {
			return userRepo.findByUsernameAndUserPass(user.getUsername(), user.getPassword());
	}
}
