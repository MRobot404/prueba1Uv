package com.like.a.shark.resttemplatems.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.like.a.shark.resttemplatems.dto.UserDTO;
import com.like.a.shark.resttemplatems.dto.UserIOs;
import com.like.a.shark.resttemplatems.dto.salida;

import lombok.RequiredArgsConstructor;
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
   

    private final RestTemplate restTemplate = new RestTemplate();


    public List<salida> getUsers(@PathVariable("name") String name) throws JsonMappingException, JsonProcessingException{
    	name.replace("%20", "+");
        String response = restTemplate.getForObject(basePath+name, String.class);
        ObjectMapper mapper=new ObjectMapper();
        UserDTO resultado=mapper.readValue(response, UserDTO.class);
        List<salida> resultado2= new ArrayList<salida>();
        List<UserIOs>temp=resultado.getResults();
        for (int i=0;i<temp.size();i++) {
        UserIOs temp2= temp.get(i);
        
        if(temp2.getName().toLowerCase().equals(name.replace("%20", " ").toLowerCase())) {
        	salida nuevo=new salida(temp2.getName(),temp2.getTrackName(),temp2.getType(),temp2.getService(),temp2.getServiceUrl());
        	resultado2.add(nuevo);
        }
		}
        return resultado2;
        
     
    }
    

   
}
