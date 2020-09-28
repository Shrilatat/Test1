package com.hsbc.test1.dao;
/**
 * Parth bapat
 * Dao file to interact with stored values
 */

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.test1.model.*;

public class ProductsDao implements ProductsDaoIntf{
	//storing treeset of products in hashmap
	//to get idea about the product type while retrieving data.
	//Couldnt finish in time so creating three different sets for different classes
	//main idea was to create a hashmap of set of products.
	HashMap<String, Set<Product>> n=new HashMap<String, Set<Product>>();
	
	Set<FoodItems> food=new TreeSet<>();
	Set<Apparel> apparel=new TreeSet<>();
	Set<Electronics> elex=new TreeSet<>();
	public void addFoodItem(FoodItems f) throws ItemIDPresentException{
		if(food.isEmpty())
			food.add(f);
		else {
		for(FoodItems f1:food) {
			if(f1.getiCode()!=f.getiCode())
				food.add(f);
			else throw new ItemIDPresentException("Item ID Already present");
		}
		}
	}
	
	public void showFoodItems() {
		int count=0;
		for(FoodItems f:food)
		{if(count<3)
			{
			System.out.println(f);
			count++;
			}
		else break;
		}
	}
	
public void addApparel(Apparel a) throws ItemIDPresentException {
	if(apparel.isEmpty())
		apparel.add(a);
	else {
	for(Apparel a1:apparel) {
		if(a1.getiCode()!=a.getiCode())
			apparel.add(a);
		else throw new ItemIDPresentException("Item ID Already present");
	}
	}
}

public void showApparels() {
	int count=0;
	for(Apparel a:apparel)
	{if(count<3)
		{
		System.out.println(a);
		count++;
		}
	else break;
	}
}

public void addElectronics(Electronics e) throws ItemIDPresentException {
	if(elex.isEmpty())
		elex.add(e);
	else {
	for(Electronics e1:elex) {
		if(e1.getiCode()!=e.getiCode())
		{
			elex.add(e);
		}
		else throw new ItemIDPresentException("Item ID Already present");
	}
	}
}
public void showElectronics() {
	int count=0;
	for(Electronics e:elex)
	{if(count<3)
		{
		System.out.println(e);
		count++;
		}
	else break;
	}
}

	
	

}
