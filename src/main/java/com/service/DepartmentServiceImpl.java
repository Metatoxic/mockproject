package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDao;

import com.model.Department;
import com.model.Employee;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DeptDao dao;

	@Override
	public Department createDept(Department department) {

		return dao.createDept(department);
	}

	@Override
	public List<Department> listOfDepartment() {

		return dao.allDept();
	}

	@Override
	public Department updateDeptById(int empId, String deptName) {

		return dao.updateDepById(empId, deptName);
	}

	@Override
	public List<Department> deleteDeptById(int empId) {

		return dao.deleteById(empId);
	}

	@Override
	public Department updateEmpById(int deptId, int empId, String deptName) {

		return dao.updateEmpById(deptId, empId, deptName);
	}

}
