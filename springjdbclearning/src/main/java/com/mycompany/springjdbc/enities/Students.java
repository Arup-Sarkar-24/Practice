package com.mycompany.springjdbc.enities;
@jakarta.persistence.Entity
public class Students {
	private int id;
	private String name;
	private String city;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
