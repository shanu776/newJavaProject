package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.Services;


@Repository("serviceDao")
public class ServicesDaoClass implements ServicesDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addServices(Services services) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(services);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Services> listServices() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Services.class).list();
	}

	@Override
	public Services getServicesData(int id) {
		// TODO Auto-generated method stub
		return (Services) sessionFactory.getCurrentSession().get(Services.class, id);
	}

	@Override
	public void deleteServicesData(Services services) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Services where service_id="+services.getService_id()).executeUpdate();
	}

}
