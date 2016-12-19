package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.ProductDao;
import com.preciso.model.Product;
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class ProductServiceClass implements ProductService{

	@Autowired
	ProductDao productDao;
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.addProduct(product);
	}

	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return productDao.listProduct();
	}

	@Override
	public Product getProductData(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductData(id);
	}

	@Override
	public void deleteProductData(Product product) {
		// TODO Auto-generated method stub
		productDao.deleteProductData(product);
	}

}
