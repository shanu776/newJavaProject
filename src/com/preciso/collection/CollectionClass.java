package com.preciso.collection;

import java.util.ArrayList;
import java.util.List;

import com.preciso.bean.AddCustomerSalesBean;
import com.preciso.model.AddCustomerSales;

public class CollectionClass implements Collection {

	@Override
	public List<AddCustomerSalesBean> prepareListOfBean(List<AddCustomerSales> addCustomerSales) {
		List<AddCustomerSalesBean>	beans=null;

		if(addCustomerSales!=null && !addCustomerSales.isEmpty())
		{
			beans=new ArrayList<AddCustomerSalesBean>();
			AddCustomerSalesBean bean=null;
			for(AddCustomerSales add:addCustomerSales)
			{
				bean=new AddCustomerSalesBean();
				bean.setId(add.getId());
				bean.setName(add.getName());
				bean.setEmail_id(add.getEmail_id());
				bean.setContact_person(add.getContact_person());
				bean.setBilling_address(add.getBilling_address());
				bean.setAddress_line1(add.getAddress_line1());
				bean.setAddress_line2(add.getAddress_line2());
				bean.setCity(add.getCity());
				bean.setState(add.getState());
				bean.setAssigned_to(add.getAssigned_to());
				bean.setPhone_no(add.getPhone_no());
				bean.setContact_no(add.getContact_no());
				bean.setZip_code(add.getZip_code());
				beans.add(bean);
			}
		}
		return beans;
	}

}
