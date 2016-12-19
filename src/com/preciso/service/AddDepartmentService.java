package com.preciso.service;

import java.util.List;

import com.preciso.model.Department;

public interface AddDepartmentService {
	public void addDepartment(Department department);
	public List<Department> listAddDepartment();
	public Department getDepartmentData(int id);
	public void deleteDepartmentData(Department addDepartment);

}
