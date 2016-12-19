package com.preciso.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="company")
public class Company {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="logo")
	@Lob
	private Blob Logo;		
	@Column(name="vat_no")
	private String vat_no;
	@Column(name="tin_no")
	private String tin_no;
	@Column(name="billing_addr")
	private String billing_addr;
	@Column(name="phone_no")
	private Long phone_no;
	@Column(name="email_id")
	private String email_id;
	@Column(name="website")
	private String website;
	@Column(name="shipping_addr")
	private String Shipping_addr;
	
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
	public Blob getLogo() {
		return Logo;
	}
	public void setLogo(Blob logo) {
		Logo = logo;
	}	
	public String getVat_no() {
		return vat_no;
	}
	public void setVat_no(String vat_no) {
		this.vat_no = vat_no;
	}
	public String getTin_no() {
		return tin_no;
	}
	public void setTin_no(String tin_no) {
		this.tin_no = tin_no;
	}
	public String getBilling_addr() {
		return billing_addr;
	}
	public void setBilling_addr(String billing_addr) {
		this.billing_addr = billing_addr;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getShipping_addr() {
		return Shipping_addr;
	}
	public void setShipping_addr(String shipping_addr) {
		Shipping_addr = shipping_addr;
	}
	
	
	
}
