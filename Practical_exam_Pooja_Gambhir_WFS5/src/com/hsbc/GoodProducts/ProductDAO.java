package com.hsbc.GoodProducts;

import java.util.*;
/*
 * Author: Pooja Gambhir
 * Purpose: This class is used to add the elements to the list
 * 
 */
public class ProductDAO implements productIntf{
	Set<FoodItems>food=new TreeSet<>();
	Set<Apparel>app=new TreeSet<>();
	Set<Electronics>ele=new TreeSet<>();
	
	@Override
	public void addFood(FoodItems f ) {
		food.add(f);
		
	}
	@Override
	public void addApp(Apparel a) {
		app.add(a);
		
	}
	@Override
	public void addEle(Electronics e) {
		ele.add(e);
		
	}
	@Override
	public void displayFood() {
		for(FoodItems f: food)
			System.out.println(f.quantity+" "+f.itemCode+" "+f.itemN+" "+f.unitPrice);
		
	}
	@Override
	public void displayApp() {
		for(Apparel a: app)
			System.out.println(a.itemCode+" "+a.itemN+" "+a.quantity+" "+a.material);
		
	}
	@Override
	public void displayEle() {
		for(Electronics e:ele)
			System.out.println(e.itemCode+" "+e.itemN+" "+e.quantity+" "+e.unitPrice);
		
	}
	
    
	
}
