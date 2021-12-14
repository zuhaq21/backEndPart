/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.springBootBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zorays
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo; 
    public Employee registerEmployee(Employee emp)
    {
        return repo.save(emp);
    }
}
