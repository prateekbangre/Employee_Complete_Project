package com.prateekbangre.employee_api.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;

    @Column
    private String employee_name;

    @Column
    private String department;

    @Column
    private String date_of_joining;

    @Column
    private String photo_file_name;
}
