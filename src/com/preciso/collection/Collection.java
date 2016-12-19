package com.preciso.collection;

import java.util.List;

import com.preciso.bean.AddCustomerSalesBean;
import com.preciso.model.AddCustomerSales;

public interface Collection {
	public List<AddCustomerSalesBean> prepareListOfBean(List<AddCustomerSales> addCustomerSales);
}
