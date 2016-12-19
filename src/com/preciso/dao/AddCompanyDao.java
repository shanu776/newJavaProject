package com.preciso.dao;

import java.util.List;

import com.preciso.model.Company;

public interface AddCompanyDao {
	public void addCompany(Company addCompany);
	public List<Company> listAddCompany();
	public Company getCompanyData(int id);
	public void deleteCompanyData(Company addCompany);
}
