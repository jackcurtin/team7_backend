package com.example.team7_backend.controller;

import com.example.team7_backend.implementations.repositories.EmployeeInfoRepositoryImpl;
import com.example.team7_backend.interfaces.repositories.EmployeeInfoJPARepository;
import com.example.team7_backend.interfaces.repositories.EmployeeInfoRepository;
import com.example.team7_backend.models.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class ResourceController {

    private EmployeeInfoJPARepository employeeInfoJPARepository;

    @Autowired
    public void setEmployeeInfoJPARepository(EmployeeInfoJPARepository employeeInfoJPARepository){
        this.employeeInfoJPARepository = employeeInfoJPARepository;
    }


    @GetMapping("/hello")
    public String helloWorld(){ return "Hello World";}

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/resources")
    public List<EmployeeInfo> getAllEmployees(){
        System.out.println("all employees " + employeeInfoJPARepository.findAll());
        List<EmployeeInfo> allEmployees = employeeInfoJPARepository.findAll();
        return allEmployees;
    }
}
