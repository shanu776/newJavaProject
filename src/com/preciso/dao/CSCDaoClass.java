package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.City;
import com.preciso.model.Country;
import com.preciso.model.State;
@Repository("cscDao")
public class CSCDaoClass implements CSCDao{
@Autowired
SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Country> getCountry() {
		// TODO Auto-generated method stub
		return (List<Country>)sessionFactory.getCurrentSession().createCriteria(Country.class).list();
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<State> getState(int country_id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().find("from State where country_id="+country_id);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<City> getCity(int state_id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().find("from City where state_id="+state_id);
	}

	@Override
	public Country getCountry(int country_id) {
		// TODO Auto-generated method stub
		return (Country) sessionFactory.getCurrentSession().get(Country.class, country_id);
	}

	@Override
	public State getState1(int state_id) {
		// TODO Auto-generated method stub
		return (State) sessionFactory.getCurrentSession().get(State.class, state_id);
	}

}
