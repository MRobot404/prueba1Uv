package com.like.a.shark.resttemplatems.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usertvmaze {
	@JsonProperty("name")
    private String name;
    @JsonProperty("trackName")
    private String trackName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("service")
    private String service;
    @JsonProperty("url")
    private String serviceUrl;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service="Tv maze";
	}
	public void setService(String service) {
		this.service = "Tv Maze";
	}
	public String getServiceUrl() {
		return serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	
	
	
	public Usertvmaze() {
				// TODO Auto-generated constructor stub
	}
	public Usertvmaze(String name, String trackName, String type, String service, String serviceUrl) {
		super();
		this.name = name;
		this.trackName = trackName;
		this.type = type;
		this.service = service;
		this.serviceUrl = serviceUrl;
	}
	
    
}
