package com.hsbc.model;

/**
 * 
 * @author Abhishek Kaushal
 * 
 * InvalidProductException is a user defined exception;
 * 
 *
 */

public class ProductAlreadyPresentException extends Exception {
	public ProductAlreadyPresentException(String message) {
		super(message);
	}
}
