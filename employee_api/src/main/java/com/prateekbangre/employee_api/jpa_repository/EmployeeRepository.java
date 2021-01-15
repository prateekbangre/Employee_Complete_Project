package com.prateekbangre.employee_api.jpa_repository;

import com.prateekbangre.employee_api.model.Department;
import com.prateekbangre.employee_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
