package com.preciso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="services")
public class Services {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="service_id")
private Integer service_id;
@Column(name="description")
private String description;
@Column(name="status")
private String status;
@Column(name="parent")
private String parent;
@Column(name="duration")
private String duration;
@Column(name="assign_to")
private String assign_to;
@Column(name="billing_price")
private String billing_price;
public Integer getService_id() {
	return service_id;
}
public void setService_id(Integer service_id) {
	this.service_id = service_id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getParent() {
	return parent;
}
public void setParent(String parent) {
	this.parent = parent;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getAssign_to() {
	return assign_to;
}
public void setAssign_to(String assign_to) {
	this.assign_to = assign_to;
}
public String getBilling_price() {
	return billing_price;
}
public void setBilling_price(String billing_price) {
	this.billing_price = billing_price;
}

}
