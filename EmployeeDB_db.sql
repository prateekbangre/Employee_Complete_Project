create database employee_db;

use employee_db;

create table department(
department_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
department_name varchar(500)
)

select * from department;

INSERT INTO department (department_name) VALUES ('IT');
INSERT INTO department (department_name) VALUES ('Support');

create table employee (
employee_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
employee_name varchar(500),
department varchar(500),
date_of_joining date,
photo_file_name varchar(500)
)

insert into employee (employee_name, department, date_of_joining, photo_file_name) values ('Sam', 'IT', '2020-11-29', 'anonymous.png')

select * from employee
