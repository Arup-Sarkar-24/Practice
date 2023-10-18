package com.mycompany.springmvcsearch.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private Name name;
	private Long id;
	private String email;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	private List<String> courses;
	private String gender;
	private String type;
	private Address address;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}


	// Updated method name from setDob to setDate
	public void setDate(String dateString) {
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parsedDate = inputFormat.parse(dateString);
			this.date = parsedDate;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getCourses() {
		return courses;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getFormattedDate() {
	    SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
	    return (date != null) ? outputFormat.format(date) : "N/A";
	}


	public void setDate(Date date) {
	    this.date = date;
	}


	@Override
	public String toString() {
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = (date != null) ? outputFormat.format(date) : "N/A";
	    String coursesString = (courses != null) ? String.join(", ", courses) : "N/A";
		return "Student name -> " + name + ", id -> " + id + ", email -> " + email + ", date -> " + formattedDate + ", courses -> " + courses + ", gender -> "
				+ gender + ", type -> " + type + ", address " + address;
	}

}
