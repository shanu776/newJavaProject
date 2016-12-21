package com.preciso.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer product_id;
	@Column(name="product_description")
	private String product_description;
	@Column(name="product_sales")
	private String product_sales;
	@Column(name="status_purchase")
	private String status_purchase;
	@Column(name="sr_no")
	private String sr_no;
	@Column(name="weight")
	private String weight;
	@Column(name="dimension")
	private String dimension;
	@Column(name="selling_price")
	private String selling_price;
	@Column(name="min_selling_price")
	private String min_selling_price;
	@Column(name="min_buying_price")
	private String min_buying_price;
	@Column(name="tax")
	private String tax;
	@Column(name="stock_limit")
	private String stock_limit;
	@Column(name="product_card")
	private String product_card;
	@Column(name="buying_price")
	private String buying_price;
	@Column(name="statistics")
	private String statistics;	
	@Column(name="stock")
	private String stock;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "related_items_FK", joinColumns = { @JoinColumn(name = "product_id") }, inverseJoinColumns = { @JoinColumn(name = "Item_ID") })
	private List<RelatedItems> related_items=new ArrayList<RelatedItems>();	
	
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_card() {
		return product_card;
	}
	public void setProduct_card(String product_card) {
		this.product_card = product_card;
	}
	public String getBuying_price() {
		return buying_price;
	}
	public void setBuying_price(String buying_price) {
		this.buying_price = buying_price;
	}
	public String getStatistics() {
		return statistics;
	}
	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_sales() {
		return product_sales;
	}
	public void setProduct_sales(String product_sales) {
		this.product_sales = product_sales;
	}
	public String getStatus_purchase() {
		return status_purchase;
	}
	public void setStatus_purchase(String status_purchase) {
		this.status_purchase = status_purchase;
	}
	public String getSr_no() {
		return sr_no;
	}
	public void setSr_no(String sr_no) {
		this.sr_no = sr_no;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(String selling_price) {
		this.selling_price = selling_price;
	}
	public String getMin_selling_price() {
		return min_selling_price;
	}
	public void setMin_selling_price(String min_selling_price) {
		this.min_selling_price = min_selling_price;
	}
	public String getMin_buying_price() {
		return min_buying_price;
	}
	public void setMin_buying_price(String min_buying_price) {
		this.min_buying_price = min_buying_price;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getStock_limit() {
		return stock_limit;
	}
	public void setStock_limit(String stock_limit) {
		this.stock_limit = stock_limit;
	}
	public List<RelatedItems> getRelated_items() {
		return related_items;
	}
	public void setRelated_items(List<RelatedItems> related_items) {
		this.related_items = related_items;
	}
	
}
