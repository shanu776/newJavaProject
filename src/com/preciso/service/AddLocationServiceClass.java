package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.AddLocationDao;
import com.preciso.model.Location;
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class AddLocationServiceClass implements AddLocationService {
	@Autowired
	private AddLocationDao addLocationDao;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void addLocation(Location location) {
		addLocationDao.addLocation(location);		
	}

	@Override
	public List<Location> listAddLocation() {
		// TODO Auto-generated method stub
		return addLocationDao.listAddLocation();
	}

	@Override
	public Location getLocationData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLocationData(Location addLocation) {
		// TODO Auto-generated method stub
		addLocationDao.deleteLocationData(addLocation);
	}

}
