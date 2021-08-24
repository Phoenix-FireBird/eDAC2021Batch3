package com.phoenix.demos;

public class Employee {
	
	int empId;
	String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int v1, String v2)
	{
		empId=v1;
		empName=v2;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
