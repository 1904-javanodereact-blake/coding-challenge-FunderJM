package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Monsters;
import com.revature.repositories.MonsterRepo;

@Service
public class MonsterServices {

	@Autowired
	private MonsterRepo monsterRepo;
	
	public List<Monsters> findAll(){
		return monsterRepo.findAll();
	}
	
//	public List<Monsters> findGood(){
//		return monsterRepo.findGood();
//	}
}
