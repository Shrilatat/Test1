package com.hsbc.service;

import com.hsbc.dao.ApparelItemsDaoImpl;
import com.hsbc.dao.ElectronicsItemsDaoImpl;
import com.hsbc.dao.FoodItemsDaoImpl;

public class ItemDaoOps {
	ApparelItemsDaoImpl apparels= new ApparelItemsDaoImpl();
	ElectronicsItemsDaoImpl electronics = new ElectronicsItemsDaoImpl();
	FoodItemsDaoImpl foodItems = new FoodItemsDaoImpl();
	
	public void chooseCategory(int catNumber) {
		if(catNumber ==1) {
			apparels.displayTop3();
			}
		else if(catNumber==2) {
			foodItems.displayTop3();
		}
		else {
			electronics.displayTop3();
		}
	}
}
	
