package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.AddCompanyDao;
import com.preciso.model.Company;
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class AddCompanyServiceClass implements AddCompanyService{
	@Autowired
	private AddCompanyDao addCompanyDao;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void addCompany(Company addCompany) {
		addCompanyDao.addCompany(addCompany);
		
	}

	@Override
	public List<Company> listAddCompany() {
		// TODO Auto-generated method stub
		return addCompanyDao.listAddCompany();
	}

	@Override
	public Company getCompanyData(int id) {
		// TODO Auto-generated method stub
		return addCompanyDao.getCompanyData(id);
	}

	@Override
	public void deleteCompanyData(Company addCompany) {
		// TODO Auto-generated method stub
		addCompanyDao.deleteCompanyData(addCompany);
	}

}
