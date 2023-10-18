package com.mycompany.springmvcsearch.entities;

public class Address {
	private String street;
	private String ward;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return " is : street -> " + street + ", ward -> " + ward + ", city -> " + city;
	}
	
	

}
