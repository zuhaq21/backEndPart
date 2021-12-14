/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.springBootBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zorays
 */
@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class EmployeeController {
    @Autowired
    EmployeeService service;
    
    @PostMapping("/registerEmployee")
    public Employee add(@RequestBody Employee emp) {
        return service.registerEmployee(emp);
    }
}
