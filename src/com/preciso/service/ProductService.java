package com.preciso.service;

import java.util.List;

import com.preciso.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public List<Product> listProduct();
	public Product getProductData(int id);
	public void deleteProductData(Product product);
}
