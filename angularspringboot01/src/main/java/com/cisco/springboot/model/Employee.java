package com.cisco.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="First_Name")
	private String  firstname;
	
	@Column(name="Last_Name")
	private String lastnsme;
	
	@Column(name="Mail_Id")
	private String emailid;
	
	@Column(name="Address")
	private String addressString;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastnsme() {
		return lastnsme;
	}
	public void setLastnsme(String lastnsme) {
		this.lastnsme = lastnsme;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public Employee(long id, String firstname, String lastnsme, String emailid, String addressString) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastnsme = lastnsme;
		this.emailid = emailid;
		this.addressString = addressString;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastnsme=" + lastnsme + ", emailid=" + emailid
				+ ", addressString=" + addressString + "]";
	}
	
	

}
