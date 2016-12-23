package com.preciso.model;

import java.io.InputStream;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private Integer id;

@Column(name="first_name")
private String first_name;

@Column(name="middle_name")
private String middle_name;

@Column(name="last_name")
private String last_name;

@Column(name="password")
private String password;

@Column(name="user_type")
private String user_type;

@Column(name="phone_no")
private String phone_no;

@Column(name="mobile_no")
private String mobile_no;

@Column(name="department")
private String department;

@Column(name="report_to")
private String report_to;

@Column(name="address")
private String address;

@Column(name="location")
private String location;

@Column(name="im_type")
private String im_type;

@Column(name="im_name")
private String im_name;

@Column(name="photo",length=1000000)
@Lob
private Blob photo;

@Column(name="cv")
@Lob
private Blob cv;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getMiddle_name() {
	return middle_name;
}

public void setMiddle_name(String middle_name) {
	this.middle_name = middle_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUser_type() {
	return user_type;
}

public void setUser_type(String user_type) {
	this.user_type = user_type;
}

public String getPhone_no() {
	return phone_no;
}

public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}

public String getMobile_no() {
	return mobile_no;
}

public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getReport_to() {
	return report_to;
}

public void setReport_to(String report_to) {
	this.report_to = report_to;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getIm_type() {
	return im_type;
}

public void setIm_type(String im_type) {
	this.im_type = im_type;
}

public String getIm_name() {
	return im_name;
}

public void setIm_name(String im_name) {
	this.im_name = im_name;
}

public Blob getPhoto() {
	return photo;
}

public void setPhoto(Blob photo) {
	this.photo = photo;
}

public Blob getCv() {
	return cv;
}

public void setCv(Blob cv) {
	this.cv = cv;
}

}
