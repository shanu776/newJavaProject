package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.Location;
@Repository("locationDao")
public class AddLocationDaoClass implements AddLocationDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addLocation(Location location) {
		sessionFactory.getCurrentSession().saveOrUpdate(location);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Location> listAddLocation() {
		// TODO Auto-generated method stub
		return (List<Location>)sessionFactory.getCurrentSession().createCriteria(Location.class).list();
	}

	@Override
	public Location getLocationData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLocationData(Location addLocation) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Location WHERE id="+addLocation.getId()).executeUpdate();
	}

}
