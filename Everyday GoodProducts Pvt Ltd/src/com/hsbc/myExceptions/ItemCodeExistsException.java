package com.hsbc.myExceptions;

public class ItemCodeExistsException extends Exception {
	public ItemCodeExistsException() {
		super();
	}

	public ItemCodeExistsException(String message) {
		super(message);
	}

}
