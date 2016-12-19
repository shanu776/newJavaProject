package com.preciso.dao;

import java.util.List;

import com.preciso.model.City;
import com.preciso.model.Country;
import com.preciso.model.State;

public interface CSCDao {
	public List<Country> getCountry();
	public Country getCountry(int country_id);
	public State getState1(int state_id);
	public List<State> getState(int country_id);
	public List<City> getCity(int state_id);
}
