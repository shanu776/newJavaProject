package com.preciso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_location")
public class CustomerLocation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="location_id")
	private Integer id;
	
	@Column(name="location_name")
	private String location_name;

	
	public CustomerLocation() {
		super();
	}

	

	public CustomerLocation(String location_name) {
		super();
		this.location_name = location_name;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getLocation_name() {
		return location_name;
	}



	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	
	
	
}
