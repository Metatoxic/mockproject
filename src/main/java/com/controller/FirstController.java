package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;

import com.service.DepartmentService;

@RestController
@RequestMapping(value = "entry")
public class FirstController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping(value = "create")
	public Department createEmp(@RequestBody Department department) {
		return departmentService.createDept(department);
	}

	@GetMapping(value = "read")
	public List<Department> readAll() {
		return departmentService.listOfDepartment();
	}

	@PutMapping(value = "update")
	public Department updateName(@RequestParam int deptId, @RequestParam String deptName) {

		return departmentService.updateDeptById(deptId, deptName);
	}

	@DeleteMapping(value = "delete")
	public List<Department> deleteDept(@RequestParam int empId) {

		return departmentService.deleteDeptById(empId);
	}

	@PutMapping(value = "updateEmp")
	public Department updateEmpName(@RequestParam int deptId, @RequestParam int empId, @RequestParam String empName) {
		return departmentService.updateEmpById(deptId, empId, empName);
	}
}
