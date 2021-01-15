package com.prateekbangre.employee_api.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
@Entity
@Table(name = "department")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;

    @Column
    private String department_name;
}
