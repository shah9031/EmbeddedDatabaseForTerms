package com.termlex;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//POJO class to store data
@Entity
public class Terms {
	@Id
	@GeneratedValue
	private int id;
	private String term;
	
	//Getters and Setter for above properties
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	
	@Override
	public String toString() {
		return term;
	}
	
	

}
