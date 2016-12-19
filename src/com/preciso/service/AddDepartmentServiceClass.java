package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.AddDepartmentDao;
import com.preciso.model.Department;
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class AddDepartmentServiceClass implements AddDepartmentService {
	@Autowired
	private AddDepartmentDao addDepartmentDao;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		addDepartmentDao.addDepartment(department);
		
	}

	@Override
	public List<Department> listAddDepartment() {
		// TODO Auto-generated method stub
		return addDepartmentDao.listAddDepartment();
	}

	@Override
	public Department getDepartmentData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentData(Department addDepartment) {
		// TODO Auto-generated method stub
		addDepartmentDao.deleteDepartmentData(addDepartment);
	}

}
