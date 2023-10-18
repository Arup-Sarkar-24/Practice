package com.mycompany.productapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName;
	private String pDescription;
	private long pPrice;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDescription() {
		return pDescription;
	}
	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	public long getpPrice() {
		return pPrice;
	}
	public void setpPrice(long pPrice) {
		this.pPrice = pPrice;
	}
	public Product(int pId, String pName, String pDescription, long pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDescription = pDescription;
		this.pPrice = pPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product Details :\n Product Id = " + pId + ", Product Name = " + pName + ", Product Description = " + pDescription + ", Product Price = " + pPrice;
	}
	

}
