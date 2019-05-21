package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dto.CredentialDto;
import com.revature.model.Users;
import com.revature.services.UserServices;

@RestController("users")
public class UserController {
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserServices userService;
	
	@PostMapping("login")
	public ResponseEntity<Users> login(@RequestBody CredentialDto credentials, HttpServletRequest req) {
		logger.debug("attempting to login");
		Users user = userService.login(credentials);
		if (user != null) {
			req.getSession().setAttribute("user", user);
			user = (Users) req.getSession().getAttribute("user");
			return new ResponseEntity<Users>(user, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Users>(HttpStatus.BAD_REQUEST);
		}
	}

}
