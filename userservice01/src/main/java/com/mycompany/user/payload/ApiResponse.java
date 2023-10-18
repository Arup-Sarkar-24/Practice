package com.mycompany.user.payload;

import org.springframework.http.HttpStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
	
	private String message;
	private boolean success;
	private HttpStatus status;

	public ApiResponse(String message, boolean success, HttpStatus status) {
		this.message = message;
		this.success = success;
		this.status = status;
	}
}
