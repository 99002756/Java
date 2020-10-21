package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int empId;
	String empName;
	String dep;
	@Autowired
	Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	@Value("${employee.id}")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	@Value("${employee.name}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDep() {
		return dep;
	}
	@Value("${employee.dep}")
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dep=" + dep + ", address=" + address + "]";
	}
	
	
}
