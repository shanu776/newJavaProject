package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.ServicesDao;
import com.preciso.model.Services;
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class ServicesServiceClass implements ServicesService{

	@Autowired
	ServicesDao serviceDao;
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public void addServices(Services services) {
		// TODO Auto-generated method stub
		serviceDao.addServices(services);
	}

	@Override
	public List<Services> listServices() {
		// TODO Auto-generated method stub
		return serviceDao.listServices();
	}

	@Override
	public Services getServicesData(int id) {
		// TODO Auto-generated method stub
		return serviceDao.getServicesData(id);
	}

	@Override
	public void deleteServicesData(Services services) {
		// TODO Auto-generated method stub
		serviceDao.deleteServicesData(services);
	}
	
	
	
	

}
