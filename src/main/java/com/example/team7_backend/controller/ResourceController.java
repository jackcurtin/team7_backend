package com.example.team7_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class ResourceController {
    @GetMapping("/hello")
    public String helloWorld(){ return "Hello World";}
}
