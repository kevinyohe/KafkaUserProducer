package com.example.userproducer.controllers;

import com.example.userproducer.service.UserProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userapi")
public class UserController {
    @Autowired
    private UserProducerService service;

    @PostMapping("/publishUserData/{name}/{age}")
    public void sendUserData(@PathVariable("name") String name,@PathVariable("age") int age){
        service.sendUserData(name, age);
        System.out.println("name = " + name);
    }
}
