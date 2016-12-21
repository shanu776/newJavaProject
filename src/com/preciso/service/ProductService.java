package com.preciso.service;

import java.util.List;

import com.preciso.model.Product;
import com.preciso.model.RelatedItems;

public interface ProductService {
	public void addProduct(Product product);
	public List<Product> listProduct();
	public List<RelatedItems> relatedItems(Product product);
	public Product getProductData(int id);
	public void deleteProductData(Product product);
}
