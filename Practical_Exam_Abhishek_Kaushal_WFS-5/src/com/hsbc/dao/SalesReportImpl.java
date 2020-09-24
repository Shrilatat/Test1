package com.hsbc.dao;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.model.Apparel;
import com.hsbc.model.Apparel.MATERIAL;
import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItem;
import com.hsbc.model.InvalidProductException;
import com.hsbc.model.Product;
import com.hsbc.model.ProductAlreadyPresentException;
import com.hsbc.model.FoodItem.VEGETARIAN;

/**
 * 
 * @author Abhishek Kaushal
 * 
 *         SalesReportImpl class is a class implementing SalesReportIntf
 *         interface to implement all the sales report features.
 * 
 *
 */
public class SalesReportImpl implements SalesReportIntf {

	public SalesReportImpl() {
		try {
			/*Initial Population*/
			addProduct(new FoodItem(101, "Milk", 50, 4, Calendar.getInstance(), Calendar.getInstance(), VEGETARIAN.YES));
			addProduct(new FoodItem(102, "Water", 50, 5, Calendar.getInstance(), Calendar.getInstance(), VEGETARIAN.YES));
			addProduct(new FoodItem(103, "Sugar", 50, 6, Calendar.getInstance(), Calendar.getInstance(), VEGETARIAN.YES));
			addProduct(new FoodItem(104, "Salt", 50, 7, Calendar.getInstance(), Calendar.getInstance(), VEGETARIAN.YES));
			addProduct(new Apparel(201, "Shirt", 500, 2, 38, MATERIAL.COTTON));
			addProduct(new Apparel(204, "Socks", 500, 1, 38, MATERIAL.COTTON));
			addProduct(new Electronics(301, "TV", 5000, 1, 2));
			addProduct(new Electronics(302, "AC", 2000, 2, 3));
			addProduct(new Electronics(303, "Laptop", 1000, 3, 5));
			addProduct(new Electronics(304, "Mobile", 2000, 4, 4));
		} catch (ProductAlreadyPresentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	Set<Product> products = new TreeSet<>();

	/* Method to add new product in set. */
	@Override
	public void addProduct(Product product) throws ProductAlreadyPresentException {
		// TODO Auto-generated method stub
		if (!products.contains(product)) {
			products.add(product);
			return;
		}
		throw new ProductAlreadyPresentException("Product already present");

	}

	/* Method to remove given product from set. */
	@Override
	public void deleteProduct(Product product) throws InvalidProductException {
		// TODO Auto-generated method stub
		if (products.contains(product)) {
			products.remove(product);
			return;
		}
		throw new InvalidProductException("Invalid Product");

	}

	/* Method to add print all products in set. */
	@Override
	public void printProducts() {
		// TODO Auto-generated method stub
		for (Product product : products) {
			System.out.println(product);
		}

	}

	/* Method to print top 3 sold products of given category in set. */
	@Override
	public void printSalesReport(String category) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Product product : products) {
			//System.out.println(product);
			String str= product.getClass().getName();
			String[] name = str.split("\\.");

			if (name[name.length-1].equals(category)) {
				System.out.println(product.getItemCode() + " : "+ product.getItemName()+" : "+ product.getQuantity()+ " : "+ name[name.length-1]);
				count++;
				if(count>=3)
				{
					return;
				}
			}
		}
	}

}
