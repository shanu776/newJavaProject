package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.Department;
@Repository("deapartmentDao")
public class AddDepartmentDaoClass implements AddDepartmentDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(department);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> listAddDepartment() {
		// TODO Auto-generated method stub
		return (List<Department>)sessionFactory.getCurrentSession().createCriteria(Department.class).list();
	}

	@Override
	public Department getDepartmentData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentData(Department addDepartment) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Department WHERE ID="+addDepartment.getId()).executeUpdate();
	}

}
