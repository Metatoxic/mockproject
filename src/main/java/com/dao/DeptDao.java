package com.dao;

import java.util.List;

import com.model.Department;

public interface DeptDao {

	public abstract Department createDept(Department department);

	public abstract List<Department> allDept();

	public abstract Department updateDepById(int deptId, String deptName);

	public abstract List<Department> deleteById(int empId);

	public abstract Department updateEmpById(int deptId, int empId, String empName);

}
