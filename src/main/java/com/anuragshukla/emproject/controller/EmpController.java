package com.anuragshukla.emproject.controller;

import com.anuragshukla.emproject.model.Employee;
import com.anuragshukla.emproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController
{
    // List<Employee> employees= new ArrayList<>();
    //we are create a object of employee services

  //EmployeeService employeeService = new EmployeeServicImpl();
    //Dependency Injection Because  Empcontroller  Class is fully depend on  EmpLoyeeService Class
   @Autowired
  EmployeeService employeeService;
        //read krne ke liye get
        @GetMapping("employees")
        public List<Employee> getAllEmployees()
        {
            return employeeService.readEmployees();
        }

    @GetMapping("employees/{id}")
    public Employee getAllEmployeeById(@PathVariable Long id)
    {
        return employeeService.readEmployee(id);
    }


        //Create krne ke liye post
        @PostMapping("employees")
        public String createEmployee(@RequestBody Employee employee)
        {
            // employees.add(employee);
             return   employeeService.createEmployee(employee);
        }

        @DeleteMapping("employees/{id}")
        public  String deleteEmployee(@PathVariable Long id)
        {
            if(employeeService.deleteEmployee(id)) {
                return "Delete Successfully";
            }
            return "Not Found";
        }
        @PutMapping("employees/{id}")
        public String putMethodName(@PathVariable Long id,@RequestBody Employee employee)
        {
            return employeeService.updateEmployee(id, employee);
        }

}
