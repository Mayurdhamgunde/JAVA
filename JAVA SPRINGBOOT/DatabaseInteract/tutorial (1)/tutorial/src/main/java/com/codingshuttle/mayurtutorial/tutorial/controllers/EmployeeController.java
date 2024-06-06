package com.codingshuttle.mayurtutorial.tutorial.controllers;

//Operations
//GET /employees
//POST /employees
//DELETE /employees/{id}

import com.codingshuttle.mayurtutorial.tutorial.dto.EmployeeDTO;
import com.codingshuttle.mayurtutorial.tutorial.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewemployee(employeeDTO);
    }

    @DeleteMapping(path="/{id}")
    public boolean deleteEmployeeById(@PathVariable long id){
        return employeeService.deleteEmployeeById(id);
    }

}
