package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.AddCustomerSalesDao;
import com.preciso.model.AddCustomerSales;
import com.preciso.model.CustomerDepartment;
import com.preciso.model.CustomerLocation;

@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class AddCustomerSalesServiceClass implements AddCustomerSalesService {
	@Autowired
	private AddCustomerSalesDao addCustomerSalesDao;

	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void addCustomerSales(AddCustomerSales addCustomerSales) {
		addCustomerSalesDao.addCustomerSales(addCustomerSales);
		
	}

	@Override
	public List<AddCustomerSales> listAddCustomerSales() {
		System.out.println("4");
		return addCustomerSalesDao.listAddCustomerSales();
	}
	
	@Override
	public AddCustomerSales getCustomerSalesData(int id) {
		// TODO Auto-generated method stub
		return addCustomerSalesDao.getCustomerSalesData(id);
	}

	@Override
	public void deleteCustomerSalesData(AddCustomerSales addCustomerSales) {
		// TODO Auto-generated method stub
		addCustomerSalesDao.deleteCustomerSalesData(addCustomerSales);
		
	}

	@Override
	public List<CustomerDepartment> listCustomerDepartment(AddCustomerSales addCustomerSales) {
		// TODO Auto-generated method stub
		return addCustomerSalesDao.listCustomerDepartment(addCustomerSales);
	}

	@Override
	public List<CustomerLocation> listCustomerLocation(AddCustomerSales addCustomerSales) {
		// TODO Auto-generated method stub
		return addCustomerSalesDao.listCustomerLocation(addCustomerSales);
	}

}
