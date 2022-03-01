package com.example.demo.services;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;

public interface EmployeeService {

    EmployeeDTO getEmployeeById(Integer id);

    void addNewEmployee(Employee employee);

}
