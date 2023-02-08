package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int deptId;
	private String deptName;
	private List<Employee> employees;

	public Department() {
		super();
	}

	public Department(int deptId, String deptName, List<Employee> employees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employees = employees;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
