package com.hsbc.test1.dao;

import com.hsbc.test1.model.Apparel;
import com.hsbc.test1.model.Electronics;
import com.hsbc.test1.model.FoodItems;

public interface ProductsDaoIntf {
	void addFoodItem(FoodItems f) throws ItemIDPresentException;
	void showFoodItems();
	void addApparel(Apparel a) throws ItemIDPresentException;
	void showApparels();
	void addElectronics(Electronics e)throws ItemIDPresentException ;
	void showElectronics();
}
