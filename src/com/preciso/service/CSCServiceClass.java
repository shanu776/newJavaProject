package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.CSCDao;
import com.preciso.model.City;
import com.preciso.model.Country;
import com.preciso.model.State;
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CSCServiceClass implements CSCService{

	@Autowired
	private CSCDao cscDAo;
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	
	@Override
	public List<Country> getCountry() {
		// TODO Auto-generated method stub
		return cscDAo.getCountry();
	}

	@Override
	public List<State> getState(int country_id) {
		// TODO Auto-generated method stub
		return cscDAo.getState(country_id);
	}

	@Override
	public List<City> getCity(int state_id) {
		// TODO Auto-generated method stub
		return cscDAo.getCity(state_id);
	}

	@Override
	public Country getCountry(int country_id) {
		// TODO Auto-generated method stub
		return cscDAo.getCountry(country_id);
	}

	@Override
	public State getState1(int state_id) {
		// TODO Auto-generated method stub
		return cscDAo.getState1(state_id);
	}

}
