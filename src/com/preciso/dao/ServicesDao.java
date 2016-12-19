package com.preciso.dao;

import java.util.List;

import com.preciso.model.Services;

public interface ServicesDao {
	public void addServices(Services services);
	public List<Services> listServices();
	public Services getServicesData(int id);
	public void deleteServicesData(Services services);
}
