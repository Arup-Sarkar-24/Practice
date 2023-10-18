package com.mycompany.user.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "micro_user")
public class User {

	@Id
	@Column(name = "User_ID")
	private String userId;

	@Column(name = "User_Name", length = 150)
	private String UserName;

	@Column(name = "User_Address", length = 300)
	private String address;

	@Column(name = "User_Email", length = 50)
	private String email;

	@Column(name = "User_About", length = 500)
	private String about;
	
	@Transient
	private Hotel hotel;
	
	@Transient
    private List<Rating> ratings=new ArrayList<>();
	

	public User(String userId, String userName, String address, String email, String about, Hotel hotel,
			List<Rating> ratings) {
		super();
		this.userId = userId;
		UserName = userName;
		this.address = address;
		this.email = email;
		this.about = about;
		this.hotel = hotel;
		this.ratings = ratings;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + ", address=" + address + ", email=" + email
				+ ", about=" + about + ", hotel=" + hotel + ", ratings=" + ratings + "]";
	}

}
