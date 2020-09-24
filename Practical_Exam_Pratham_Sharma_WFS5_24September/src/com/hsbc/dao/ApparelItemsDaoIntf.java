package com.hsbc.dao;

import com.hsbc.model.Apparel;
import com.hsbc.userdefinedexceptions.ItemAlreadyExists;
import com.hsbc.userdefinedexceptions.ItemNotFound;

/*
 * @Author Pratham Sharma
 * 
 * Interface created to be show zero implementation of the operation that can be done on Apparel item
 */
public interface ApparelItemsDaoIntf {
	public void addApparelItem(Apparel item) throws ItemAlreadyExists;
	public void deleteApparelItem(int itemCode) throws ItemNotFound;
	public void addQuantity(int itemCode, int quantity);
	public void reduceQuantity(int itemCode, int quantity);
	public void displayAllItems();
	public void displayTop3();
}
