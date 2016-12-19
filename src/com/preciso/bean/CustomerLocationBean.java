package com.preciso.bean;

public class CustomerLocationBean {	
	private Integer id;	
	private String name;
	
	
	public CustomerLocationBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerLocationBean(String name) {
		super();
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
