package com.hsbc.myExceptions;

public class CategoryMissingException extends Exception {
	public CategoryMissingException() {
		super();
	}

	public CategoryMissingException(String message) {
		super(message);
	}

}
