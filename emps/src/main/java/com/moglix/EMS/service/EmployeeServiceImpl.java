package com.moglix.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.moglix.EMS.dto.Employee;

import com.moglix.EMS.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

//	public static EmployeeService getInstance() {
//		if(employeeService==null) {
//			employeeService=new EmployeeServiceImpl();
//			return employeeService;
//			}
//		else {
//			return employeeService;
//		}
//	}


	private EmployeeServiceImpl() {

	}

	private static EmployeeService employeeService;


	public Employee addEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		if (employee2 != null) {
			return employee2;
		} else {
			return null;
		}
	}


	@Override
	public Employee updateEmployee(String id, Employee employee) {

		if (employee.getEmp_id() != null) {
			return addEmployee(employee);

		} else
			return null;
	}


	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}


	@Override
	public List<Employee> getEmployees() {

		return employeeRepository.findAll();
	}


	@Override
	public String deleteEmployeeById(String id) {
		try {
			employeeRepository.deleteById(id);
			return "success";
		} catch (Exception e) {

			e.printStackTrace();
			return "fail to delete";
		}
	}


	@Override
	public String deleteAllEmployee() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();
		return "successfully deleted all";


	}

}