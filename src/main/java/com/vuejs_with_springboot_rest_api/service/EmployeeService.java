package com.vuejs_with_springboot_rest_api.service;

import com.vuejs_with_springboot_rest_api.entity.Employee;
import com.vuejs_with_springboot_rest_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>(employeeRepository.findAll());
       return employees;
    }

    public Optional<Employee> getEmployee(long id) {
        return employeeRepository.findById(id);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateTopic(Employee employee, Long id) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
