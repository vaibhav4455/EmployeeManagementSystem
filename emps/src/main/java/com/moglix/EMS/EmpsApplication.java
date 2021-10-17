package com.moglix.EMS;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moglix.EMS.dto.Employee;
import com.moglix.EMS.service.EmployeeService;

@SpringBootApplication //config+comp scan reading prop file
public class EmpsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext=SpringApplication.run(EmpsApplication.class, args);
	//	EmployeeService employeeService=applicationContext.getBean(EmployeeService.class);
	//	String result=employeeService.addEmployee(new Employee("0098","sanchit","saumay",28000.00,"xyts","pancard"));
//		
//		System.out.println(result);
//		employeeService.addEmployee(new Employee("002","sat","saay",280080.00,"xyffts","perge"));
//		employeeService.addEmployee(new Employee("100","it","saumay",28000.00,"xyts","pancard"));
//		employeeService.addEmployee(new Employee("98","prince","saumay",28000.00,"xyts","pancard"));
//		
//		Employee result2= employeeService.getEmployeeById("002");
//		System.out.println(result2);
//		
//		String result3=employeeService.deleteEmployeeById("100");
//		System.out.println(result3);
//		
//		String result4=employeeService.deleteAllEmployee();
//		System.out.println(result4);
//		
//		List<Employee> emp=employeeService.getEmployees();
//		System.out.println(emp);
//		
		
		
		
		
		
		
	}

}
