package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Monsters {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int monsterId;
	private String monsterName;
	private Boolean goodOrBad;
	
	
	public Monsters(int monsterId, String monsterName, Boolean goodOrBad) {
		super();
		this.monsterId = monsterId;
		this.monsterName = monsterName;
		this.goodOrBad = goodOrBad;
	}
	public Monsters() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goodOrBad == null) ? 0 : goodOrBad.hashCode());
		result = prime * result + monsterId;
		result = prime * result + ((monsterName == null) ? 0 : monsterName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monsters other = (Monsters) obj;
		if (goodOrBad == null) {
			if (other.goodOrBad != null)
				return false;
		} else if (!goodOrBad.equals(other.goodOrBad))
			return false;
		if (monsterId != other.monsterId)
			return false;
		if (monsterName == null) {
			if (other.monsterName != null)
				return false;
		} else if (!monsterName.equals(other.monsterName))
			return false;
		return true;
	}
	public int getMonsterId() {
		return monsterId;
	}
	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}
	public String getMonsterName() {
		return monsterName;
	}
	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	public Boolean getGoodOrBad() {
		return goodOrBad;
	}
	public void setGoodOrBad(Boolean goodOrBad) {
		this.goodOrBad = goodOrBad;
	}
	@Override
	public String toString() {
		return "Monsters [monsterId=" + monsterId + ", monsterName=" + monsterName + ", goodOrBad=" + goodOrBad + "]";
	}
	
}
