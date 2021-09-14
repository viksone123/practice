package com.example.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.Entity.Employee;
import com.example.practice.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empser;

	@RequestMapping("/employee")
	public List<Employee> getAllEmployee() {
		return empser.getAllEmployee();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public void addEmployee(@RequestBody Employee employee) {
		empser.addEmployee(employee);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employee{id}")
	public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
		empser.updateEmployee(id, employee);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employee{id}")
	public void deleteEmployee(@PathVariable String id) {
		empser.deleteEmployee(id);
	}

}
