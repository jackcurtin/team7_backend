package com.example.team7_backend.controller;

import com.example.team7_backend.implementations.repositories.EmployeeInfoRepositoryImpl;
import com.example.team7_backend.interfaces.repositories.EmployeeInfoJPARepository;
import com.example.team7_backend.interfaces.repositories.EmployeeInfoRepository;
import com.example.team7_backend.models.EmployeeInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class ResourceController {

    private EmployeeInfoJPARepository employeeInfoJPARepository;

    @GetMapping("/hello")
    public String helloWorld(){ return "Hello World";}

    @GetMapping("/resource")
    public List<EmployeeInfo> getAllEmployees(){
        List <EmployeeInfo> allEmployees = employeeInfoJPARepository.findAll();
    }
}
