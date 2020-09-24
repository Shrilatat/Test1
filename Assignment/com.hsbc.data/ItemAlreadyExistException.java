package com.hsbc.practical;

public class ItemAlreadyExistException extends Exception {
	
	public ItemAlreadyExistException() {
		super();
	}
	
	public String toString(){ 
		return ("Item Already Exists in Set:") ;
	   }
}
