package com.mycompany.productapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import javax.transaction.Transactional;

import com.mycompany.productapp.model.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void  createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//read : get all product
	public List<Product> getProducts(){
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	//read a single product
		public Product getProduct(int pId) {
			return this.hibernateTemplate.get(Product.class, pId) ;
		}
			
	//delete the single product
	@Transactional
	public void deleteProduct(int pId) {
		Product p = this.hibernateTemplate.load(Product.class, pId);
		this.hibernateTemplate.delete(p);
	}
	

}
