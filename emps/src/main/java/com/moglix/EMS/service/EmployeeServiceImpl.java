package com.moglix.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.moglix.EMS.dto.Employee;

import com.moglix.EMS.repository.EmployeeRepository;

@Service  //for serviceimpl
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
		// TODO Auto-generated constructor stub
		
	}
	private static EmployeeService employeeService;
	
	
	public Employee addEmployee(Employee employee) {
		Employee employee2= employeeRepository.save(employee);
		if(employee2!=null) {
			return employee2;
		}
		else {
			return null;
		}
	}


	@Override
	public Employee updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getEmp_id()!=null) {
			return addEmployee(employee);
			
		}
		else
		return null;
	}


	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional=employeeRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();		
			}
		return null;
	}


	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}


	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		try {
			employeeRepository.deleteById(id);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
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

//	public String updateEmployee(String id, Employee employee) {
//		// TODO Auto-geManager manager1=new Manager( "001","vaibhav","kumar",45000d);
//	//  System.out.println(manager1);
//	//  Employee manager=new Manager();
//	//  System.out.println(manager.calculateSalary());
//	//  Manager m=new Manager();
//	//  System.out.println(m);
//	//  System.out.println(m.calculateSalary());nerated method stub
//		return null;
//	}
//
//	public Employee getEmployeeById(String id) {
//		return employeeRepository.getEmployeeById(id);
//	}
//
//	public List<Employee> getEmployees() {
//		return employeeRepository.getEmployees();
//	}
//
//	public String deleteEmployeeById(String id) {
//		return employeeRepository.deleteEmployeeById(id);
//	}
//
//	public void deleteAllEmployee() {
//		employeeRepository.deleteAllEmployee();
//
//	}

}
