package com.prateekbangre.employee_api.jpa_repository;

import com.prateekbangre.employee_api.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

    @Query(value = "select department_name from department",nativeQuery = true)
    List<String> getAllDepartmentName();
}
