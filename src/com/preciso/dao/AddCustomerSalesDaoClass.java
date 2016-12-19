package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.AddCustomerSales;
import com.preciso.model.CustomerDepartment;
import com.preciso.model.CustomerLocation;
@Repository("addCustomerSalesDao")
public class AddCustomerSalesDaoClass implements AddCustomerSalesDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCustomerSales(AddCustomerSales addCustomerSales) {
		sessionFactory.getCurrentSession().saveOrUpdate(addCustomerSales);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AddCustomerSales> listAddCustomerSales() {
		
		return (List<AddCustomerSales>)sessionFactory.getCurrentSession().createCriteria(AddCustomerSales.class).list();
	}

	@Override
	public AddCustomerSales getCustomerSalesData(int id) {
		// TODO Auto-generated method stub
		return (AddCustomerSales) sessionFactory.getCurrentSession().get(AddCustomerSales.class, id);
	}

	@Override
	public void deleteCustomerSalesData(AddCustomerSales addCustomerSales) {
		sessionFactory.getCurrentSession().createSQLQuery("SET FOREIGN_KEY_CHECKS=0").executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("delete from customer_location where location_id in ("
				+ "select location_id from customer_location_fk where customer_id="+addCustomerSales.getId()+")").executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("delete from customer_department where department_id in (select department_id " 
				+"from customer_department_fk where customer_id="+addCustomerSales.getId()+")").executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("SET FOREIGN_KEY_CHECKS=1").executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("delete from customer_location_FK where customer_id="+addCustomerSales.getId()).executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("delete from customer_department_FK where customer_id="+addCustomerSales.getId()).executeUpdate();
		sessionFactory.getCurrentSession().createQuery("DELETE FROM AddCustomerSales WHERE id = "+addCustomerSales.getId()).executeUpdate();	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerDepartment> listCustomerDepartment(AddCustomerSales addCustomerSales) {
		// TODO Auto-generated method stub
		return (List<CustomerDepartment>)sessionFactory.getCurrentSession().createSQLQuery("select department_name from Customer_department cd join Customer_department_fk cdk on cd.department_id=cdk.department_id where cdk.customer_id="+addCustomerSales.getId()).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerLocation> listCustomerLocation(AddCustomerSales addCustomerSales) {
		// TODO Auto-generated method stub
		return (List<CustomerLocation>)sessionFactory.getCurrentSession().createSQLQuery("select location_name from Customer_location cd join Customer_location_fk cdk on cd.location_id=cdk.location_id where cdk.customer_id="+addCustomerSales.getId()).list();
	}	
	
}
