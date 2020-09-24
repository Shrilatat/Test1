package com.hsbc.service;

import java.util.Calendar;
import java.util.Scanner;

import com.hsbc.dao.SalesReportImpl;
import com.hsbc.model.FoodItem;
import com.hsbc.model.FoodItem.VEGETARIAN;
import com.hsbc.model.ProductAlreadyPresentException;

/**
 * 
 * @author Abhishek Kaushal
 * 
 * SalesReportOperations is a class to interact with user.
 * 
 *
 */

public class SalesReportOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Category of products for generation of sales report from FoodItem, Apparel and Electronics: ");
		String category = scanner.next();
		
		SalesReportImpl dao = new SalesReportImpl();
		
		//dao.printProducts();
		
		dao.printSalesReport(category);
	}

}
