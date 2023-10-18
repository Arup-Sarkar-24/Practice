package com.mycompany.user.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	//add extra properties to manage
	
	public ResourceNotFoundException() {
		super("Resource not found on server !!");
	}
	
	public ResourceNotFoundException( String message) {
		super(message);
	}

}
