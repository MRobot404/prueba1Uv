package com.like.a.shark.resttemplatems.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown =true)
public class UserDTO2 {
	@JsonProperty("score")
   private int score;
   private Object Usertvmaze;
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public Object getUsertvmaze() {
	return Usertvmaze;
}
public void setUsertvmaze(Object usertvmaze) {
	Usertvmaze = usertvmaze;
}


   
   
}
