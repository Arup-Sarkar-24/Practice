package com.mycompany.cafe.main.wrapper;

import lombok.*;

@Data
@NoArgsConstructor
public class UserWrapper {
	private Integer id;
	private String name;
	private String email;
	private String contactNumber;
	private String status;
	
	public UserWrapper(Integer id, String name, String email, String contactNumber, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
		this.status = status;
	}
	
	
}