package com.moglix.EMS.service;

import java.util.List;

import com.moglix.EMS.dto.Employee;

public interface EmployeeService {

public Employee  addEmployee(Employee employee);
public Employee updateEmployee(String id, Employee employee);
public Employee getEmployeeById(String id);
public List<Employee> getEmployees();
public String deleteEmployeeById(String id);  
public String deleteAllEmployee();

}
