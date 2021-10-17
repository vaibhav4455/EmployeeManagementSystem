package com.moglix.EMS.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@javax.persistence.Entity
@Table(name="Employee")

//orm mapping object relatin mapping
public class Employee {
 @Id
 @Column(name = "employee_id")
 
	private String emp_id;
 
	private String emp_firstName;
	private String empLastName;
	private Double empSalary;
	private String empAddress;
	//@Column(name = "PAN")
	private String empPanCard;
	public Employee() {
		super();
	}
	public Employee(String emp_id, String emp_firstName, String empLastName, Double empSalary, String empAddress,
			String empPanCard) {
		super();
		this.emp_id = emp_id;
		this.emp_firstName = emp_firstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.empPanCard = empPanCard;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_firstName() {
		return emp_firstName;
	}
	public void setEmp_firstName(String emp_firstName) {
		this.emp_firstName = emp_firstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpPanCard() {
		return empPanCard;
	}
	public void setEmpPanCard(String empPanCard) {
		this.empPanCard = empPanCard;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_firstName=" + emp_firstName + ", empLastName=" + empLastName
				+ ", empSalary=" + empSalary + ", empAddress=" + empAddress + ", empPanCard=" + empPanCard + "]";
	}
	
	
	
}
