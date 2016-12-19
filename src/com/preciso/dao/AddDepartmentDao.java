package com.preciso.dao;

import java.util.List;

import com.preciso.model.Department;

public interface AddDepartmentDao {
	public void addDepartment(Department department);
	public List<Department> listAddDepartment();
	public Department getDepartmentData(int id);
	public void deleteDepartmentData(Department addDepartment);

}
