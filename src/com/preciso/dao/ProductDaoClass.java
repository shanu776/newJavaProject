package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.Product;
import com.preciso.model.RelatedItems;
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
		System.out.println(id);
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Override
	public void deleteProductData(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createSQLQuery("SET FOREIGN_KEY_CHECKS=0").executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("delete from related_items where item_id in(select item_id from related_items_fk"
				+ " where product_id="+product.getProduct_id()+")").executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("SET FOREIGN_KEY_CHECKS=1").executeUpdate();
		sessionFactory.getCurrentSession().createSQLQuery("delete from related_items_fk where product_id="+product.getProduct_id()).executeUpdate();
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Product WHERE Id="+product.getProduct_id()).executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RelatedItems> relatedItems(Product product) {
		// TODO Auto-generated method stub
		return (List<RelatedItems>)sessionFactory.getCurrentSession().createSQLQuery("select item_name from related_items ri join related_items_fk rik on "
				+ "ri.item_id=rik.item_id where rik.product_id="+product.getProduct_id()).list();
	}

}
