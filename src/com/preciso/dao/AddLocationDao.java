package com.preciso.dao;

import java.util.List;

import com.preciso.model.Location;

public interface AddLocationDao {
	public void addLocation(Location location);
	public List<Location> listAddLocation();
	public Location getLocationData(int id);
	public void deleteLocationData(Location addLocation);
}
