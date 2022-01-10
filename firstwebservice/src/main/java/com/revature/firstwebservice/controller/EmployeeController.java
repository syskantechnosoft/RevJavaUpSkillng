package com.revature.firstwebservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.firstwebservice.model.Employee;

@RestController
public class EmployeeController {
	
	List<Employee> employeesList = new ArrayList<Employee>();
	
	public EmployeeController() {
		employeesList.add(new Employee(100, "abc", "abc@gmail.com"));
		employeesList.add(new Employee(101, "xyz", "xyz@gmail.com"));
		employeesList.add(new Employee(102, "mno", "mno@gmail.com"));
		employeesList.add(new Employee(103, "pqr", "pqr@gmail.com"));
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeesList;
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee emp = null;
		for (Employee employee : employeesList) {
			if(employee.getId() == id)
				emp = employee;
		}
		return emp;
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee emp) {
		employeesList.add(emp);
	}
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee emp) {
		for (Employee employee : employeesList) {
			if(employee.getId() == id)
				employeesList.remove(employee);
		}
		employeesList.add(emp);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		for (Employee employee : employeesList) {
			if(employee.getId() == id)
				employeesList.remove(employee);
		}	
	}

}
