package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.model.Product;

/**
 * 
 * @author bk
 *Purpose : Skeleton for dao, methods to be implemented.
 */
public interface ProductDaoIntf {
	
	public void initializeCatalog();
	public void addItem();
	public void displayReport(String category);
	public void iterateOverSet(TreeSet<Product> set);
	
}
