package com.like.a.shark.resttemplatems.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.like.a.shark.resttemplatems.dto.UserDTO;
import com.like.a.shark.resttemplatems.dto.UserDTO2;
import com.like.a.shark.resttemplatems.dto.UserIOs;
import com.like.a.shark.resttemplatems.dto.Usertvmaze;
import com.like.a.shark.resttemplatems.dto.salida;
import com.like.a.shark.resttemplatems.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/find")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService = new UserService();

    @GetMapping("/test/{name}")
    public ResponseEntity<List<salida>> getAll(@PathVariable("name") String name) throws JsonMappingException,JsonProcessingException,JsonEOFException{
        return new ResponseEntity<>(userService.getUsers(name), HttpStatus.OK);
    }
    
    @GetMapping("/tests/{name}")
    public ResponseEntity<List<UserDTO2>>getAlls(@PathVariable("name") String name) throws JsonMappingException,JsonProcessingException,JsonEOFException{
        return new ResponseEntity<>(userService.getUserss(name),HttpStatus.OK);
    }
}

 
