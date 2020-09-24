package com.hsbc.dao;

import com.hsbc.model.InvalidProductException;
import com.hsbc.model.Product;
import com.hsbc.model.ProductAlreadyPresentException;

/**
 * 
 * @author Abhishek Kaushal
 * 
 * SalesReportIntf interface is an interface to be used by SalesReportImpl class to implement all the sales report features.
 * 
 *
 */

public interface SalesReportIntf {
	void addProduct(Product product) throws ProductAlreadyPresentException;
	void deleteProduct(Product product) throws InvalidProductException;
	void printProducts();
	void printSalesReport(String category);
	
}
