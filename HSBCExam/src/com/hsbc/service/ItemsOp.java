package com.hsbc.service;
//Author: Ritakshi Sen
//Purpose : This class makes a treeset of the items to be added in the product list of the retailers database

import java.util.TreeSet;
import com.hsbc.model.Apparel;
import com.hsbc.model.Electronics;
import com.hsbc.model.FoodItems;
import com.hsbc.model.Item;
import com.hsbc.dao.*;


public class ItemsOp {
	
	public static void main(String[] args) {
		TreeSet<Item> items = new TreeSet<Item>(); 
		
	   Item i1 = new FoodItems(101, "Burger", 10, 10 , "23-10-20", "23-10-21", "yes") ;
	   Item i2 = new FoodItems(102, "Pizza", 20, 10 , "26-10-20", "23-12-20", "yes") ;
	   
	   Item i3 = new Electronics(103, "Iron", 1000, 10 , 5);
	   Item i4 = new Electronics(104, "Bulb", 200, 10 , 3);
	   
	   Item i5=new Apparel(105, "skirt", 10, 20, 34, "Cotton");
	   Item i6=new Apparel(105, "Shirt", 10, 25, 35, "Linen");
	   
	   //adds items to the created treeset
	   items.add(i1);
	   items.add(i2);
	   items.add(i3);
	   items.add(i4);
	   items.add(i5);
	   items.add(i6);
	   
	   ItemsDaoImpl impl = new ItemsDaoImpl();
	   impl.showTopItems(items);
	}

}
