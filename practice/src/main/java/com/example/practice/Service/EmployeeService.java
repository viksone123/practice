package com.example.practice.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.Entity.Employee;
import com.example.practice.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeRepository emprepo;

	public List<Employee> getAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		emprepo.findAll().forEach(employee::add);
		return employee;

	}

	public void addEmployee(Employee employee) {

		emprepo.save(employee);
	}

	public void updateEmployee(String id, Employee employee) {
		emprepo.save(employee);

	}

	public void deleteEmployee(String id) {
		emprepo.deleteById(id);

	}

}
