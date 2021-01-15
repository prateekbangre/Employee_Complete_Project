package com.prateekbangre.employee_api.service;

import com.prateekbangre.employee_api.jpa_repository.EmployeeRepository;
import com.prateekbangre.employee_api.model.Department;
import com.prateekbangre.employee_api.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {

        List<Employee> list = new ArrayList<>();
        employeeRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public String add(Employee employee) {
        employeeRepository.save(employee);
        return "Updated Successfully.";
    }

    public String update(Employee employee) {
        employeeRepository.save(employee);
        return "Updated Successfully.";
    }

    public String deleteById(int id) {
        employeeRepository.deleteById(id);
//        boolean isPresent = departmentRepository.existsById(id);
//        if (!isPresent)
            return "Deleted Successfully.";
//        else
//            return "Not Able To Delete.";
    }
}
