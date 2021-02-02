package com.jackson.cursomc.services.exceptions;

public class ObejectNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ObejectNotFoundException(String msg) {
		
		super(msg);
	}
	
	public ObejectNotFoundException(String msg, Throwable cause) {
		super (msg, cause); 
	}

}
