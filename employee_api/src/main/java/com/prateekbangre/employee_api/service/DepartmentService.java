package com.prateekbangre.employee_api.service;

import com.prateekbangre.employee_api.jpa_repository.DepartmentRepository;
import com.prateekbangre.employee_api.model.Department;
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
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        departmentRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public String add(Department department) {
        Department save = departmentRepository.save(department);
        if (save.getDepartment_name().equals(department.getDepartment_name()))
            return "Updated Successfully.";
        else
            return "Not Able To Save.";
    }

    public String update(Department department) {
        Department save = departmentRepository.save(department);
        if (save.getDepartment_name().equals(department.getDepartment_name()))
            return "Updated Successfully.";
        else
            return "Not Able To Save.";
    }

    public String deleteById(int id) {
        departmentRepository.deleteById(id);
//        boolean isPresent = departmentRepository.existsById(id);
//        if (!isPresent)
            return "Deleted Successfully.";
//        else
//            return "Not Able To Delete.";
    }

    public List<String> getAllDepartmentName(){
        return departmentRepository.getAllDepartmentName();
    }

}
