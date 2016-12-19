package com.preciso.service;

import java.util.List;

import com.preciso.model.Company;

public interface AddCompanyService {
	public void addCompany(Company addCompany);
	public List<Company> listAddCompany();
	public Company getCompanyData(int id);
	public void deleteCompanyData(Company addCompany);
}
