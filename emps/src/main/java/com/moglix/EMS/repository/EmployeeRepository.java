package com.moglix.EMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moglix.EMS.dto.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, String>{
	


}
