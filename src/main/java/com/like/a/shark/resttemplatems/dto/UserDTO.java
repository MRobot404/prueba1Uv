package com.like.a.shark.resttemplatems.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown =true)
public class UserDTO {
	@JsonProperty("resultCount")
   private int resultCount;
   private List<UserIOs> results=new ArrayList<UserIOs>();
  
public int getResultCount() {
	return resultCount;
}
public void setResultCount(int resultCount) {
	this.resultCount = resultCount;
}
public List<UserIOs> getResults() {
	return results;
}
public void setResults(List<UserIOs> results) {
	this.results = results;
}
  

    
}
