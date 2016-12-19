package com.preciso.dao;

import java.util.List;

import com.preciso.model.AddCustomerSales;
import com.preciso.model.CustomerDepartment;
import com.preciso.model.CustomerLocation;

public interface AddCustomerSalesDao {
	public void addCustomerSales(AddCustomerSales addCustomerSales);
	public List<AddCustomerSales> listAddCustomerSales();
	public List<CustomerDepartment> listCustomerDepartment(AddCustomerSales addCustomerSales);
	public List<CustomerLocation> listCustomerLocation(AddCustomerSales addCustomerSales);
	public AddCustomerSales getCustomerSalesData(int id);
	public void deleteCustomerSalesData(AddCustomerSales addCustomerSales);
}
