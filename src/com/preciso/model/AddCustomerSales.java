package com.preciso.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AddCustomerSales")
public class AddCustomerSales {
	@Id
	@GeneratedValue
	@Column(name="customer_id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email_id")
	private String email_id;
	
	@Column(name="contact_person")
	private String contact_person;
	
	@Column(name="shipping_address")
	private String shipping_address;
	
	@Column(name="billing_address")
	private String billing_address;
	
	@Column(name="address_line1")
	private String address_line1;
	
	@Column(name="address_line2")
	private String address_line2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="assign_to")
	private String assigned_to;	
	
	@Column(name="phone_no")
	private Long phone_no;
	
	@Column(name="contact_no")
	private Long contact_no;
	
	@Column(name="zip_code")
	private Integer zip_code;
	
	@Column(name="vat_no")
	private String vat_no;
	
	@Column(name="cst_no")
	private String cst_no;
	
	@Column(name="shipping_method")
	private String shipping_method;
	
	@Column(name="payment_term")
	private String payment_terms;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="created_by")
	private String created_by;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_location_FK", joinColumns = { @JoinColumn(name = "customer_id") }, inverseJoinColumns = { @JoinColumn(name = "LOCATION_ID") })
	private List<CustomerLocation> location=new ArrayList<CustomerLocation>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="customer_department_FK",joinColumns={@JoinColumn(name="customer_id")},inverseJoinColumns={@JoinColumn(name="department_id")})
	private List<CustomerDepartment> department=new ArrayList<CustomerDepartment>();

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

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public String getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}

	public String getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}

	public Long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}

	public Long getContact_no() {
		return contact_no;
	}

	public void setContact_no(Long contact_no) {
		this.contact_no = contact_no;
	}

	public Integer getZip_code() {
		return zip_code;
	}

	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}

	public String getVat_no() {
		return vat_no;
	}

	public void setVat_no(String vat_no) {
		this.vat_no = vat_no;
	}

	public String getCst_no() {
		return cst_no;
	}

	public void setCst_no(String cst_no) {
		this.cst_no = cst_no;
	}

	public String getShipping_method() {
		return shipping_method;
	}

	public void setShipping_method(String shipping_method) {
		this.shipping_method = shipping_method;
	}

	public String getPayment_terms() {
		return payment_terms;
	}

	public void setPayment_terms(String payment_terms) {
		this.payment_terms = payment_terms;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public List<CustomerLocation> getLocation() {
		return location;
	}

	public void setLocation(List<CustomerLocation> location) {
		this.location = location;
	}

	public List<CustomerDepartment> getDepartment() {
		return department;
	}

	public void setDepartment(List<CustomerDepartment> department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}