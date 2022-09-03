package com.alterra.queueloging.controllers;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alterra.queueloging.Services.UserService;
import com.alterra.queueloging.dtos.UserRequest;
import com.alterra.queueloging.entities.User;
import com.alterra.queueloging.repositories.UserRepo;


@RestController
@RequestMapping("/api/user")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private UserRepo userRepo;

    @Autowired    
    private ModelMapper modelMapper;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserRequest userRequest){

        if (!StringUtils.isEmpty(userRequest.getEmail())){
            User user = userRepo.findByEmail(userRequest.getEmail());
            if (user != null){
                LOG.warn("Email sudah terdaftar");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email sudah terdaftar");    
            }
        } 

        if (!StringUtils.isEmpty(userRequest.getUsername())){
            User user = userRepo.findByUsername(userRequest.getUsername());
            if (user != null){
                LOG.warn("Username sudah terdaftar");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username sudah terdaftar");
            }
        }

        try {
            User user = modelMapper.map(userRequest, User.class);
            user = userRepo.save(user);
            String payload = user.getUsername()+ " (" +user.getEmail()+ ") terdaftar sebagai user baru";
            LOG.info(payload);
            userService.send(payload);
            return ResponseEntity.ok().body(payload);

        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());    
        }
        
    }

}
