package com.preciso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	Integer product_id;
	@Column(name="product_card")
	String product_card;
	@Column(name="buying_price")
	String buying_price;
	@Column(name="statistics")
	String statistics;
	@Column(name="related_items")
	String related_items;
	@Column(name="stock")
	String stock;
	
	
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
	public String getRelated_items() {
		return related_items;
	}
	public void setRelated_items(String related_items) {
		this.related_items = related_items;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
	
	
}
