package com.moglix.EMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.EMS.dto.Employee;
import com.moglix.EMS.service.EmployeeService;

@Controller
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/hello")
	public String sayHello() {
		return "hello from Vaibhav ";
	}
	@PostMapping("/add") //json to java object --@RequestBody //spring4
	//spring will take care transform json to java object(jackson datatype jar )
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	//	return employee;
		//java-->json-->spring-->jackson		
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		
		return this.employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") String id) {
		return this.employeeService.deleteEmployeeById(id);
	}
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return this.employeeService.deleteAllEmployee();
	}
}
