package com.project.mongodbproject.services.exception;

public class ObjectNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}

}
