package com.like.a.shark.resttemplatems.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class salida {
	    private String name;
	    private String trackName;
	    private String type;
	    private String service;
	    private String serviceUrl;
		public salida(String name2, String trackName2, String type2, String service2, String serviceUrl2) {
			// TODO Auto-generated constructor stub
		}
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
			return service;
		}
		public void setService(String service) {
			this.service = service;
		}
		public String getServiceUrl() {
			return serviceUrl;
		}
		public void setServiceUrl(String serviceUrl) {
			this.serviceUrl = serviceUrl;
		}
	      
	
	    }
