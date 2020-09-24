package com.hsbc.dao;

import java.util.TreeSet;

import com.hsbc.model.Item;

//Author: Ritakshi Sen
//Purpose : This interface contains the function for showing top items in a category
//			This is used to provide encapsulation

public interface ItemsDaoIntf  {
	
	void showTopItems(TreeSet<Item> items);

}
