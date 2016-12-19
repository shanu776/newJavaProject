package com.preciso.dao;

import java.util.List;

import com.preciso.model.Product;

public interface ProductDao {
public void addProduct(Product product);
public List<Product> listProduct();
public Product getProductData(int id);
public void deleteProductData(Product product);
}
