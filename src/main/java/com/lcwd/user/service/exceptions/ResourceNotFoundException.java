package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Rsource not found");
	}

	public ResourceNotFoundException(String s) {
		super(s);
	}


}
