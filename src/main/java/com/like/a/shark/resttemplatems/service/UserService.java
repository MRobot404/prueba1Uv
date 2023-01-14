package com.like.a.shark.resttemplatems.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.like.a.shark.resttemplatems.dto.UserDTO;
import com.like.a.shark.resttemplatems.dto.UserDTO2;
import com.like.a.shark.resttemplatems.dto.UserIOs;
import com.like.a.shark.resttemplatems.dto.Usertvmaze;
import com.like.a.shark.resttemplatems.dto.salida;

import lombok.RequiredArgsConstructor;

import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

 
    private String basePath="https://itunes.apple.com/search?term=";
    private String basePath2="https://api.tvmaze.com/search/people?q=";
   

    private final RestTemplate restTemplate = new RestTemplate();
    private final RestTemplate restTemplate2 = new RestTemplate();

    public List<salida> getUsers(@PathVariable("name") String name) throws JsonMappingException, JsonProcessingException{
    	name.replace("%20", "+");
        String response = restTemplate.getForObject(basePath+name, String.class);
        ObjectMapper mapper=new ObjectMapper();
        UserDTO resultado=mapper.readValue(response, UserDTO.class);
        List<salida> resultado2= new ArrayList<salida>();
        List<UserIOs>temporal=resultado.getResults();
        for (int i=0;i<temporal.size();i++) {
        UserIOs temporal2= temporal.get(i);
        
        if(temporal2.getName().toLowerCase().equals(name.replace("%20", " ").toLowerCase())) {
        	salida nuevo=new salida(temporal2.getName(),temporal2.getTrackName(),temporal2.getType(),temporal2.getService(),temporal2.getServiceUrl());
        	resultado2.add(nuevo);
        }
		}
        
        String response2 = restTemplate.getForObject(basePath2+name, String.class);
        
      
        
       
        return resultado2;
        
     
    }
    public List<UserDTO2> getUserss (@PathVariable("name") String name) throws JsonMappingException, JsonProcessingException{
    	ObjectMapper mapper=new ObjectMapper();
    	String contenido = restTemplate.getForObject(basePath2+name, String.class);
    	UserDTO2[] result2 = mapper.readValue(contenido, UserDTO2[].class);        
    	List<UserDTO2> tempB = Arrays.asList(result2);
        
       
        
        return tempB;
        
     
    }
    
    
    
    
    

   
}
