package com.preciso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_department")
public class CustomerDepartment {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="department_id")
private Integer id;
@Column(name="department_name")
private String department_name;
public CustomerDepartment() {
	super();
	// TODO Auto-generated constructor stub
}
public CustomerDepartment(String department_name) {
	super();
	this.department_name = department_name;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}





}
