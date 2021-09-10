package com.vuejs_with_springboot_rest_api.controller;

import com.vuejs_with_springboot_rest_api.entity.Employee;
import com.vuejs_with_springboot_rest_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@CrossOrigin("https://localhost:8081/")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable long id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public void addEmployee (@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @PutMapping("employees/{id}")
    public void updateTopic(@RequestBody Employee employee, @PathVariable Long id){
        employeeService.updateTopic(employee, id);
    }

    @DeleteMapping("employees/{id}")
    public void deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
    }

}
