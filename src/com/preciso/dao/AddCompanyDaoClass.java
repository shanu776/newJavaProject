package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.Company;
@Repository("addCompanyDao")
public class AddCompanyDaoClass implements AddCompanyDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addCompany(Company addCompany) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(addCompany);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> listAddCompany() {
		// TODO Auto-generated method stub
		return (List<Company>)sessionFactory.getCurrentSession().createCriteria(Company.class).list();
	}

	@Override
	public Company getCompanyData(int id) {
		// TODO Auto-generated method stub
		return (Company) sessionFactory.getCurrentSession().get(Company.class, id);
	}

	@Override
	public void deleteCompanyData(Company addCompany) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Company WHERE ID="+addCompany.getId()).executeUpdate();
	}

}
