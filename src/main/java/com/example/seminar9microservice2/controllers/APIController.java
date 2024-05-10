package com.example.seminar9microservice2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class APIController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Microservize-2";
    }
}
