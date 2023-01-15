package com.like.a.shark.resttemplatems.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO2 {

	private int score;
	
	private  Usertvmaze person;


public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public Usertvmaze getPerson() {
	return person;
}
public void setPerson(Usertvmaze person) {
	this.person = person;
}



   
   
}
