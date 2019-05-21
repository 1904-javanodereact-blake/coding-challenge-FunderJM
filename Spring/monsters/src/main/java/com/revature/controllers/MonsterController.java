package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Monsters;
import com.revature.services.MonsterServices;

@RestController("monsters")
public class MonsterController {
	
	@Autowired
	private MonsterServices monsterService;
	
	@GetMapping("trainer")
	public ResponseEntity<List<Monsters>> findAll(){
		return new ResponseEntity<List<Monsters>>(monsterService.findAll(), HttpStatus.OK);
	}

}
