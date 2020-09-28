package com.hsbc.test1.model;

public class Product {
	private int iCode;
	private String iName;
	
	public Product() {		// TODO Auto-generated constructor stub
	}
	public Product(int iCode, String iName) {
		super();
		this.iCode = iCode;
		this.iName = iName;
	}
	public int getiCode() {
		return iCode;
	}
	public void setiCode(int iCode) {
		this.iCode = iCode;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	

	
}
