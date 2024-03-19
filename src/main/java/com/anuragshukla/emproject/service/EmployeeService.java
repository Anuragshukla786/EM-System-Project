package com.anuragshukla.emproject.service;

import com.anuragshukla.emproject.model.Employee;

import java.util.List;

public interface EmployeeService {

     String createEmployee(Employee employee);
     List<Employee> readEmployees();
     boolean deleteEmployee(Long id);
     String updateEmployee(Long id,Employee employee);
     Employee readEmployee(Long id);



     // List<Employee> readEmployees();
}
