package com.cisco.validation.master.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {
	@NotBlank(message = "User Name can not not be empty !!")
	@Size(min = 3,max = 12, message = "User name must be between 3 to 12 characters !!")
	private String username;
	
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LoginData(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + "]";
	}
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
