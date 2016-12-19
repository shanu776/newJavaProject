package com.preciso.service;

import java.util.List;

import com.preciso.model.Location;

public interface AddLocationService {
	public void addLocation(Location location);
	public List<Location> listAddLocation();
	public Location getLocationData(int id);
	public void deleteLocationData(Location addLocation);
}
