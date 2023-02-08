package com.service;

import java.util.List;

import com.model.Department;

public interface DepartmentService {

	public abstract Department createDept(Department department);

	public abstract List<Department> listOfDepartment();

	public abstract Department updateDeptById(int empId, String deptName);

	public abstract List<Department> deleteDeptById(int empId);

	public abstract Department updateEmpById(int deptId, int empId, String deptName);

}
