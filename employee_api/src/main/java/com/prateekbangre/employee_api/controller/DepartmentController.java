package com.prateekbangre.employee_api.controller;

import com.prateekbangre.employee_api.model.Department;
import com.prateekbangre.employee_api.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping
    List<Department> getDepartmentData(){
        return departmentService.findAll();
    }

    @PostMapping
    String addDepartmentName(@RequestBody Department department){
        return departmentService.add(department);
    }

    @PutMapping
    String updateDepartmentName(@RequestBody Department department){
        return departmentService.update(department);
    }

    @DeleteMapping("/{department_id}")
    public String delete(@PathVariable int department_id) {
        return departmentService.deleteById(department_id);
    }

    @GetMapping("/name")
    public List<String> getAllDepartmentName(){
        return departmentService.getAllDepartmentName();
    }
}
