package com.example.practice.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.practice.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
