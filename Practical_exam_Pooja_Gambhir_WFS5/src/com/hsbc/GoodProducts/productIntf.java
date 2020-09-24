package com.hsbc.GoodProducts;
/*
 * Author:Pooja Gambhir
 * Purpose: This code is an interface used to create all the methods of the class
 */
public interface productIntf {
	void addFood(FoodItems f);
	void addApp(Apparel a);
	void addEle(Electronics e);
	void displayFood();
	void displayApp();
	void displayEle();
}
