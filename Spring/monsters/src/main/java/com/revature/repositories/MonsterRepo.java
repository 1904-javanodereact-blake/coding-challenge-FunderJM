package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Monsters;

public interface MonsterRepo extends JpaRepository<Monsters, Integer>{
		List<Monsters> findByMonsterId(int monsterId);
		
//		List<Monsters> findByGoodOrBad(Boolean goodOrBad);
}
