package com.prateekbangre.employee_api.controller;

import com.prateekbangre.employee_api.model.Department;
import com.prateekbangre.employee_api.model.Employee;
import com.prateekbangre.employee_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.xml.ws.spi.http.HttpContext;
import java.util.List;


/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    List<Employee> getEmployeeData(){
        return employeeService.findAll();
    }

    @PostMapping
    String addEmployeeData(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @PutMapping
    String updateEmployeeData(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @DeleteMapping("/{employee_id}")
    public String deleteEmployeeData(@PathVariable int employee_id) {
        return employeeService.deleteById(employee_id);
    }
    
}
