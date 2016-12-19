package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.Product;
@Repository("productDao")
public class ProductDaoClass implements ProductDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(product);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}

	@Override
	public Product getProductData(int id) {
		// TODO Auto-generated method stub
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Override
	public void deleteProductData(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Product WHERE Id="+product.getProduct_id()).executeUpdate();
		
	}

}
