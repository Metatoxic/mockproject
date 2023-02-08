package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Department;
import com.model.Employee;

@Repository
public class DeptDaoImpl implements DeptDao {

	static List<Department> departments = new ArrayList<Department>();

	@Override
	public Department createDept(Department department) {
		departments.add(department);

		return department;
	}

	@Override
	public List<Department> allDept() {

		return departments;
	}

	@Override
	public Department updateDepById(int deptId, String deptName) {
		Department tempDept = null;
		for (Department dept : departments) {
			if (deptId == dept.getDeptId()) {
				dept.setDeptName(deptName);
				tempDept = dept;
			}
		}
		return tempDept;

	}

	@Override
	public List<Department> deleteById(int empId) {

		for (Department d1 : departments) {
			List<Employee> emps = d1.getEmployees();

			for (Employee employee : emps) {
				if (empId == employee.getEmpId()) {
					emps.remove(employee);
				}
			}
		}

		return departments;
	}

	@Override
	public Department updateEmpById(int deptId, int empId, String empName) {
		Department tempDept2 = null;
		for (Department dept2 : departments) {
			List<Employee> empLists = dept2.getEmployees();

			for (Employee tempEmp : empLists) {
				if (empId == tempEmp.getEmpId()) {
					tempEmp.setEmpName(empName);
					tempDept2 = dept2;
				}
			}
		}
		return tempDept2;
	}

}
