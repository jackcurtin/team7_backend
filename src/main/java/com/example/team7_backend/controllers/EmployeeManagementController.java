package com.example.team7_backend.controllers;

import com.example.team7_backend.interfaces.repositories.EmployeeInfoRepository;
import com.example.team7_backend.utilities.FileParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/employee-management")
public class EmployeeManagementController {

    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    @PostMapping("/upload-file")
    public HttpStatus uploadFile(@RequestParam("file") MultipartFile file) {

        try (InputStream inputStream =  new BufferedInputStream(file.getInputStream());) {
            List lstEmp = FileParser.readExcelFile(inputStream);
            employeeInfoRepository.bulkSave(lstEmp);
        } catch(Exception e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @GetMapping("/")
    public String ping() {
        return "HELLO";
    }


}
